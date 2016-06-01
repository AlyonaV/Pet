package mvc.service.impl;

import mvc.persistence.dao.ProtocolDao;
import mvc.persistence.model.Protocol;
import mvc.service.ProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("protocolService")
@Transactional
public class ProtocolServiceImpl implements ProtocolService{
    @Autowired
    ProtocolDao protocolDao;

    @Override
    public Protocol getById(Integer id) {
        return protocolDao.getById(id);
    }

    @Override
    public void save(Protocol protocol) {
        protocolDao.save(protocol);
    }

    @Override
    public void deleteById(Integer id) {
        protocolDao.deleteById(id);
    }

    @Override
    public List<Protocol> getAllProtocols() {
        return protocolDao.getAllProtocols();
    }
}
