package mvc.persistence.dao.impl;

import mvc.persistence.dao.AbstractDao;
import mvc.persistence.dao.DeviceDao;
import mvc.persistence.model.Device;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("deviceDao")
public class DeviceDaoImpl extends AbstractDao<Integer, Device> implements DeviceDao {
    @Override
    public Device findById(Integer id) {
        return getByKey(id);
    }

    @Override
    public Device findByImei(String imei) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("imei", imei));
        return (Device) crit.uniqueResult();
    }

    @Override
    public void save(Device device) {
        persist(device);
    }

    @Override
    public void deleteById(Integer id) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Device device = (Device) crit.uniqueResult();
        delete(device);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Device> getAllDevices() {
        Criteria crit = createEntityCriteria();
        List<Device> devices = (List<Device>) crit.list();
//        for(Device device:devices){
//            Hibernate.initialize(device.getPet());
//            Pet pet = device.getPet();
//            Hibernate.initialize(pet.getPetGroups());
//        }
        return (List<Device>) crit.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Device> getByPetId(Integer petId) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.sqlRestriction("petId = "+ petId));
        return (List<Device>) crit.list();
    }
}
