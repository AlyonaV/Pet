package mvc.persistence.dao;

import mvc.persistence.model.User;

import java.util.List;

/**
 * Created by Alona on 21.05.2016.
 */
public interface UserDao {
    User getById(Integer id);

    User getByEmail(String email);

    void save(User user);

    void update(User user);

    void deleteById(Integer id);

    List<User> getAllUsers();

    public boolean authorizeUser(String email, String password);
}
