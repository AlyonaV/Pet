package mvc.controller.owner;

import mvc.persistence.dto.PetDevicesDTO;
import mvc.persistence.dto.PetGroupDevicesDTO;
import mvc.persistence.model.Device;
import mvc.persistence.model.Pet;
import mvc.persistence.model.PetGroup;
import mvc.service.DeviceService;
import mvc.service.PetGroupService;
import mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/groups/", method = RequestMethod.GET)
    public ResponseEntity<List<PetGroupDevicesDTO>> listAllUsers(@RequestParam("userEmail") String userEmail) {
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
}
