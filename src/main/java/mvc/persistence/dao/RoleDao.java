package mvc.persistence.dao;

import mvc.persistence.model.Role;

import java.util.List;

/**
 * Created by Alona on 21.05.2016.
 */

public interface RoleDao {
    Role getById(Integer id);

    List<Role> getAllRoles();

}
