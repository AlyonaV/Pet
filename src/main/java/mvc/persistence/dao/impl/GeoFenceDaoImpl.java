package mvc.persistence.dao.impl;

import mvc.persistence.dao.AbstractDao;
import mvc.persistence.dao.GeofenceDao;
import mvc.persistence.model.Geofence;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("geoFenceDao")
public class GeoFenceDaoImpl extends AbstractDao<Integer, Geofence> implements GeofenceDao{
    @Override
    public Geofence getById(Integer id) {
        return getByKey(id);
    }

    @Override
    public Geofence getByDeviceId(Integer deviceId) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("deviceId",deviceId));
        return (Geofence) crit.uniqueResult();
    }

    @Override
    public void save(Geofence geofence) {
        persist(geofence);
    }

    @Override
    public void deleteById(Integer id) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Geofence geofence = (Geofence)crit.uniqueResult();
        delete(geofence);
    }
}
