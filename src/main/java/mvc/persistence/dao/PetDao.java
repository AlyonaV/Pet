package mvc.persistence.dao;

import mvc.persistence.model.Pet;

import java.util.List;

/**
 * Created by Alona on 21.05.2016.
 */
public interface PetDao {

    Pet getById(Integer id);

    void save(Pet pet);

    void deleteById(Integer id);

    List<Pet> getAllPets();
}
