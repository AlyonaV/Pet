package mvc.persistence.dao;

import mvc.persistence.model.Activity;

import java.util.List;

/**
 * Created by Alona on 21.05.2016.
 */
public interface ActivityDao {

    Activity getById(Integer id);

    List<Activity> getByDeviceId(Integer id);

    void save(Activity activity);

    void deleteById(Integer id);
}
