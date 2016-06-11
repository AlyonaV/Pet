package mvc.controller.owner;

import mvc.persistence.dto.PositionDTO;
import mvc.persistence.model.Activity;
import mvc.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/owner")
public class OwnerArchieveController {

    @Autowired
    ActivityService activityService;

    @RequestMapping(value = "/deviceActivity/", method = RequestMethod.GET)
    public ResponseEntity<List<PositionDTO>> deviceActivity(@RequestParam("deviceId") Integer deviceId,
                                                            @RequestParam(required = false, value = "dateStart") Date dateStart,
                                                            @RequestParam(required = false, value = "dateFinish") Date dateFinish){
        List<Activity> activities = activityService.getByDeviceId(deviceId);
        if(activities==null){
            return new ResponseEntity<List<PositionDTO>>(HttpStatus.NO_CONTENT);
        }
        List<PositionDTO> positionDTOs = new ArrayList<>();

        for(Activity activity: activities){
            positionDTOs.add(new PositionDTO(activity));
        }
        HttpHeaders header = new HttpHeaders();
        header.add("Access-Control-Allow-Origin", "*");
        header.add("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        header.add("Access-Control-Max-Age", "3600");
        header.add("Access-Control-Allow-Headers", "X-Requested-With");
        return new ResponseEntity<List<PositionDTO>>(positionDTOs, header, HttpStatus.OK);
    }

}
