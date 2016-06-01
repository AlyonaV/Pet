package mvc.service;

import mvc.persistence.model.Device;

import java.util.List;

/**
 * Created by Alona on 22.05.2016.
 */
public interface DeviceService {

    Device findById(Integer id);

    Device findByImei(String imei);

    void save(Device device);

    void deleteById(Integer id);

    List<Device> getAllDevices();
}
