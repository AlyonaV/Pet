package mvc.service.impl;

import mvc.persistence.dao.ActivityDao;
import mvc.persistence.model.Activity;
import mvc.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("activityService")
@Transactional
public class ActivityServiceImpl implements ActivityService{
    @Autowired
    ActivityDao dao;

    @Override
    public Activity getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<Activity> getByDeviceId(Integer id) {
        return dao.getByDeviceId(id);
    }

    @Override
    public void save(Activity activity) {
        dao.save(activity);
    }

    @Override
    public void deleteById(Integer id) {
        dao.getByDeviceId(id);
    }

    @Override
    public Activity getLast(Integer deviceId) {
        return dao.getLast(deviceId);
    }
}
