package mvc.service;

import mvc.persistence.model.PetGroup;

import java.util.List;

/**
 * Created by Alona on 22.05.2016.
 */
public interface PetGroupService {
    PetGroup getById(Integer id);

    PetGroup getByName(String name);

    List<PetGroup> getByUserId(Integer id);

    void save(PetGroup petGroup);

    void deleteById(Integer id);
}
