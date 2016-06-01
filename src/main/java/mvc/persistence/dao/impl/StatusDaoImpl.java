package mvc.persistence.dao.impl;

import mvc.persistence.dao.AbstractDao;
import mvc.persistence.dao.StatusDao;
import mvc.persistence.model.Status;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("statusDao")
public class StatusDaoImpl extends AbstractDao<Integer, Status> implements StatusDao{
    @Override
    public Status getById(Integer id) {
        return getByKey(id);
    }

    @Override
    public void save(Status status) {
        persist(status);
    }

    @Override
    public void deleteById(Integer id) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Status status = (Status)crit.uniqueResult();
        delete(status);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Status> getAllStatuses() {
        Criteria crit = createEntityCriteria();
        return (List<Status>) crit.list();
    }
}
