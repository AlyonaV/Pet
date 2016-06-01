package mvc.service.impl;

import mvc.persistence.dao.PetGroupDao;
import mvc.persistence.model.PetGroup;
import mvc.service.PetGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("petGroupService")
@Transactional
public class PetGroupServiceImpl implements PetGroupService{
    @Autowired
    PetGroupDao dao;

    @Override
    public PetGroup getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public PetGroup getByName(String name) {
        return dao.getByName(name);
    }

    @Override
    public List<PetGroup> getByUserId(Integer id) {
        return dao.getByUserId(id);
    }

    @Override
    public void save(PetGroup petGroup) {
        dao.save(petGroup);
    }

    @Override
    public void deleteById(Integer id) {
        dao.deleteById(id);
    }
}
