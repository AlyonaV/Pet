package mvc.service.impl;

import mvc.persistence.dao.RoleDao;
import mvc.persistence.model.Role;
import mvc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao dao;

    @Override
    public Role getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public List<Role> getAllRoles() {
        return dao.getAllRoles();
    }
}
