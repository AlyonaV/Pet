package mvc.service;

import mvc.persistence.model.Status;

import java.util.List;

/**
 * Created by Alona on 22.05.2016.
 */
public interface StatusService {
    Status getById(Integer id);

    void save(Status status);

    void deleteById(Integer id);

    List<Status> getAllStatuses();
}
