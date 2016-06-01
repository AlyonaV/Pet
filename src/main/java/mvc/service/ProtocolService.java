package mvc.service;

import mvc.persistence.model.Protocol;

import java.util.List;

/**
 * Created by Alona on 22.05.2016.
 */
public interface ProtocolService {
    Protocol getById(Integer id);

    void save(Protocol protocol);

    void deleteById(Integer id);

    List<Protocol> getAllProtocols();
}
