package mvc.persistence.dao;

import mvc.persistence.model.Protocol;

import java.util.List;

/**
 * Created by Alona on 21.05.2016.
 */
public interface ProtocolDao {
    Protocol getById(Integer id);

    void save(Protocol protocol);

    void deleteById(Integer id);

    List<Protocol> getAllProtocols();
}
