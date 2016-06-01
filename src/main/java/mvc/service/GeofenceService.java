package mvc.service;

import mvc.persistence.model.Geofence;

/**
 * Created by Alona on 22.05.2016.
 */
public interface GeofenceService {

    Geofence getById(Integer id);

    Geofence getByDeviceId(Integer deviceId);

    void save(Geofence geofence);

    void deleteById(Integer id);
}
