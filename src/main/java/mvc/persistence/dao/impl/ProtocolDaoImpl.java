package mvc.persistence.dao.impl;

import mvc.persistence.dao.AbstractDao;
import mvc.persistence.dao.ProtocolDao;
import mvc.persistence.model.Protocol;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("protocolDao")
public class ProtocolDaoImpl extends AbstractDao<Integer,Protocol> implements ProtocolDao{
    @Override
    public Protocol getById(Integer id) {
        return getByKey(id);
    }

    @Override
    public void save(Protocol protocol) {
        persist(protocol);
    }

    @Override
    public void deleteById(Integer id) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Protocol protocol = (Protocol)crit.uniqueResult();
        delete(protocol);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Protocol> getAllProtocols() {
        Criteria crit = createEntityCriteria();
        return (List<Protocol>)crit.list();
    }
}
