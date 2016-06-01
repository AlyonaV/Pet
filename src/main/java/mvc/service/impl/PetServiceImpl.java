package mvc.service.impl;

import mvc.persistence.dao.PetDao;
import mvc.persistence.model.Pet;
import mvc.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("petService")
@Transactional
public class PetServiceImpl implements PetService{
    @Autowired
    PetDao dao;

    @Override
    public Pet getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public void save(Pet pet) {
        dao.save(pet);
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public List<Pet> getAllPets() {
        return dao.getAllPets();
    }

    @Override
    public void updatePet(Pet pet) {
        Pet entity = dao.getById(pet.getId());
        if(entity!=null){
            entity.setName(pet.getName());
            entity.setPetGroups(pet.getPetGroups());
            entity.setPetState(pet.getPetState());
        }
    }
}
