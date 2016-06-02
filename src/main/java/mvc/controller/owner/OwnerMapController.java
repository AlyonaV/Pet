package mvc.controller.owner;

import mvc.persistence.model.PetGroup;
import mvc.persistence.model.User;
import mvc.service.PetGroupService;
import mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/owner")
public class OwnerMapController {
    @Autowired
    PetGroupService petGroupService;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/groups/", method = RequestMethod.GET)
    public ResponseEntity<List<PetGroup>> listAllUsers(@RequestParam("userEmail") String userEmail) {
        System.out.println("getAllPetGroups");
        Integer ownerId = userService.getByEmail(userEmail).getId();
        List<PetGroup> petGroups = petGroupService.getByUserId(ownerId);
        if (petGroups.isEmpty()) {
            return new ResponseEntity<List<PetGroup>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<PetGroup>>(petGroups, HttpStatus.OK);
    }
}
