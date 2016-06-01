package mvc.service.impl;

import mvc.persistence.dao.GeofenceDao;
import mvc.persistence.model.Geofence;
import mvc.service.GeofenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("geofenceService")
@Transactional
public class GeofenceServiceImpl implements GeofenceService{
    @Autowired
    GeofenceDao dao;

    @Override
    public Geofence getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public Geofence getByDeviceId(Integer deviceId) {
        return dao.getByDeviceId(deviceId);
    }

    @Override
    public void save(Geofence geofence) {
        dao.save(geofence);
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }
}
