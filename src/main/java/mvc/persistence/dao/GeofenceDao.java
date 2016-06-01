package mvc.persistence.dao;

import mvc.persistence.model.Geofence;

/**
 * Created by Alona on 21.05.2016.
 */
public interface GeofenceDao {

    Geofence getById(Integer id);

    Geofence getByDeviceId(Integer deviceId);

    void save(Geofence geofence);

    void deleteById(Integer id);
}
