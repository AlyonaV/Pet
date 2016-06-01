package mvc.service;

import mvc.persistence.model.Role;

import java.util.List;

/**
 * Created by Alona on 22.05.2016.
 */
public interface RoleService {
    Role getById(Integer id);

    List<Role> getAllRoles();
}
