package mvc.service.impl;

import mvc.persistence.dao.DeviceDao;
import mvc.persistence.model.Device;
import mvc.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("deviceService")
@Transactional
public class DeviceServiceImpl implements DeviceService{
    @Autowired
    DeviceDao dao;

    @Override
    public Device findById(Integer id) {
        return dao.findById(id);
    }

    @Override
    public Device findByImei(String imei) {
        return dao.findByImei(imei);
    }

    @Override
    public void save(Device device) {
        dao.save(device);
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Device> getAllDevices() {
        return dao.getAllDevices();
    }
}
