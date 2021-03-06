package mvc.controller.owner;

import mvc.SessionActivityAttributes;
import mvc.persistence.dto.PetDevicesDTO;
import mvc.persistence.dto.PetGroupDevicesDTO;
import mvc.persistence.dto.PositionDTO;
import mvc.persistence.model.Activity;
import mvc.persistence.model.Device;
import mvc.persistence.model.Pet;
import mvc.persistence.model.PetGroup;
import mvc.service.ActivityService;
import mvc.service.DeviceService;
import mvc.service.PetGroupService;
import mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/owner")
public class OwnerMapController {
    @Autowired
    PetGroupService petGroupService;

    @Autowired
    UserService userService;

    @Autowired
    DeviceService deviceService;

    @Autowired
    ActivityService activityService;

    SessionActivityAttributes sessionActivityAttributes = SessionActivityAttributes.getInstance();

    @RequestMapping(value = "/groups/", method = RequestMethod.GET)
    public ResponseEntity<List<PetGroupDevicesDTO>> listAllGroups(@RequestParam("userEmail") String userEmail) {
        System.out.println("getAllPetGroups");
        Integer ownerId = userService.getByEmail(userEmail).getId();
        List<PetGroup> petGroups = petGroupService.getByUserId(ownerId);
        List<PetGroupDevicesDTO> petGroupDevicesDTOs = new ArrayList<PetGroupDevicesDTO>();
        for (PetGroup petGroup : petGroups) {
            List<PetDevicesDTO> petDevicesDTOs = new ArrayList<>();
            for (Pet pet : petGroup.getPets()) {
                PetDevicesDTO petDevicesDTO = new PetDevicesDTO();
                petDevicesDTO.setId(pet.getId());
                petDevicesDTO.setPetState(pet.getPetState());
                petDevicesDTO.setName(pet.getName());
                petDevicesDTO.setDevices(deviceService.getByPetId(pet.getId()));
                petDevicesDTOs.add(petDevicesDTO);
            }
            petGroupDevicesDTOs.add(new PetGroupDevicesDTO(petGroup, petDevicesDTOs));
        }
        if (petGroups.isEmpty()) {
            return new ResponseEntity<List<PetGroupDevicesDTO>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<PetGroupDevicesDTO>>(petGroupDevicesDTOs, HttpStatus.OK);
    }

    @RequestMapping(value = "/deviceNewActivity/", method = RequestMethod.GET)
    public ResponseEntity<PositionDTO> deviceNewActivity(@RequestParam("deviceId") Integer deviceId
//                                                      ,@RequestParam(required = false, value = "lastPosition")
//                                                      PositionDTO lastPosition
    ) throws InterruptedException {
        PositionDTO lastPosition = sessionActivityAttributes.getLastPosition(deviceId);
        if (lastPosition != null) {
            if (!sessionActivityAttributes.hasRefreshed(deviceId, lastPosition)) {
                Thread.sleep(500);
            }
        } else {
            sessionActivityAttributes.createSession(deviceId, new PositionDTO(activityService.getLast(deviceId)));
        }
        Activity lastActivity = activityService.getLast(deviceId);

        if (lastActivity == null) {
            return new ResponseEntity<PositionDTO>(HttpStatus.NO_CONTENT);
        }
        PositionDTO lastPositionDTO = new PositionDTO(lastActivity);
        HttpHeaders header = new HttpHeaders();
        header.add("Access-Control-Allow-Origin", "*");
        header.add("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        header.add("Access-Control-Max-Age", "3600");
        header.add("Access-Control-Allow-Headers", "X-Requested-With");
        return new ResponseEntity<PositionDTO>(lastPositionDTO, header, HttpStatus.OK);
    }
}
