package mvc.persistence.dao.impl;

import mvc.persistence.dao.AbstractDao;
import mvc.persistence.dao.PetDao;
import mvc.persistence.model.Pet;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("petDao")
public class PetDaoImpl extends AbstractDao<Integer, Pet> implements PetDao {
    @Override
    public Pet getById(Integer id) {
        Pet pet = getByKey(id);
//        if(pet!=null){
//            Hibernate.initialize(pet.getPetGroups());
//        }
        return pet;
    }

    @Override
    public void save(Pet pet) {
        persist(pet);
    }

    @Override
    public void deleteById(Integer id) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Pet pet = (Pet) crit.uniqueResult();
        delete(pet);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Pet> getAllPets() {
        Criteria crit = createEntityCriteria();
        List<Pet> pets = (List<Pet>) crit.list();
//        for(Pet pet:pets)
//        Hibernate.initialize(pet.getPetGroups());
        return pets;
    }
}
