package mvc.service;

import mvc.persistence.model.User;

import java.util.List;

public interface UserService {
    User getById(Integer id);

    User getByEmail(String email);

    void save(User user);

    void update(User user);

    void deleteById(Integer id);

    List<User> getAllUsers();

    boolean authorizeUser(String email, String password);
}
