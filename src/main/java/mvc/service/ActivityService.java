package mvc.service;

import mvc.persistence.model.Activity;

import java.util.List;

/**
 * Created by Alona on 22.05.2016.
 */
public interface ActivityService {

    Activity getById(Integer id);

    List<Activity> getByDeviceId(Integer id);

    void save(Activity activity);

    void deleteById(Integer id);
}
