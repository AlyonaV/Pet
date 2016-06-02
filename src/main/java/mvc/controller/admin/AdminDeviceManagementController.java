package mvc.controller.admin;

import mvc.persistence.model.Device;
import mvc.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminDeviceManagementController {
    @Autowired
    DeviceService deviceService;

    @RequestMapping(value = "/device/", method = RequestMethod.GET)
    public ResponseEntity<List<Device>> listAllUsers() {
        System.out.println("getAllDevices");
        List<Device> devices = deviceService.getAllDevices();
        if (devices.isEmpty()) {
            return new ResponseEntity<List<Device>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Device>>(devices, HttpStatus.OK);
    }
}
