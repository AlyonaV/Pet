package mvc.persistence.dao.impl;

import mvc.persistence.dao.AbstractDao;
import mvc.persistence.dao.RoleDao;
import mvc.persistence.model.Role;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Alona on 21.05.2016.
 */
@Repository("roleDao")
public class RoleDaoImpl extends AbstractDao<Integer,Role> implements RoleDao{
    @Override
    public Role getById(Integer id) {
        return getByKey(id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Role> getAllRoles() {
        Criteria crit = createEntityCriteria();
        return (List<Role>) crit.list();
    }
}
