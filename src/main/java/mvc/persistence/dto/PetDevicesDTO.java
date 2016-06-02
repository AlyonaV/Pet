package mvc.persistence.dto;

import mvc.persistence.model.Device;
import mvc.persistence.model.Pet;
import mvc.persistence.model.PetGroup;
import mvc.persistence.model.PetState;

import java.util.List;

/**
 * Created by Alona on 02.06.2016.
 */
public class PetDevicesDTO extends Pet{
    private List<Device> devices;

    public PetDevicesDTO() {
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
