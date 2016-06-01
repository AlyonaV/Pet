package mvc.persistence.dao;

import mvc.persistence.model.Status;

import java.util.List;

/**
 * Created by Alona on 21.05.2016.
 */
public interface StatusDao {
    Status getById(Integer id);

    void save(Status status);

    void deleteById(Integer id);

    List<Status> getAllStatuses();
}
