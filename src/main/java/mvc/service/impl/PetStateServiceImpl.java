package mvc.service.impl;

import mvc.persistence.dao.PetStateDao;
import mvc.persistence.model.PetState;
import mvc.service.PetStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("petStateService")
@Transactional
public class PetStateServiceImpl implements PetStateService{
    @Autowired
    PetStateDao dao;

    @Override
    public PetState getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public void save(PetState petState) {
        dao.save(petState);
    }

    @Override
    public void update(PetState petState) {
        dao.update(petState);
    }
}
