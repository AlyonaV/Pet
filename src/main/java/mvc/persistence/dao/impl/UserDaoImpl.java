package mvc.persistence.dao.impl;

import mvc.persistence.dao.AbstractDao;
import mvc.persistence.dao.UserDao;
import mvc.persistence.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {
    @Override
    public User getById(Integer id) {
        return getByKey(id);
    }

    @Override
    public User getByEmail(String email) {
        System.out.println("Email : " + email);
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("email", email));
        return (User) crit.uniqueResult();
    }

    @Override
    public void save(User user) {
        persist(user);
    }

    @Override
    public void update(User user) {
        persist(user);
    }

    @Override
    public void deleteById(Integer id) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        User user = (User) crit.uniqueResult();
        delete(user);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllUsers() {
        Criteria criteria = createEntityCriteria();
        return (List<User>) criteria.list();
    }

    @Override
    public boolean authorizeUser(String email, String password) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("email", email));
        crit.add(Restrictions.eq("password",password));
        User user = (User) crit.uniqueResult();
        if(user==null)
            return false;
        else return true;
    }
}
