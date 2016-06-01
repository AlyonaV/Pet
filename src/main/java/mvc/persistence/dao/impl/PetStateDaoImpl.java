package mvc.persistence.dao.impl;

import mvc.persistence.dao.AbstractDao;
import mvc.persistence.dao.PetStateDao;
import mvc.persistence.model.PetState;
import org.springframework.stereotype.Repository;

/**
 * Created by Alona on 22.05.2016.
 */
@Repository("petState")
public class PetStateDaoImpl extends AbstractDao<Integer,PetState> implements PetStateDao{
    @Override
    public PetState getById(Integer id) {
        return getByKey(id);
    }

    @Override
    public void save(PetState petState) {
        persist(petState);
    }

    @Override
    public void update(PetState petState) {
        persist(petState);
    }
}
