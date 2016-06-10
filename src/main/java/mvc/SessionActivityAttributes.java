package mvc;

import mvc.persistence.dto.PositionDTO;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alona on 02.06.2016.
 */
public class SessionActivityAttributes {
    private SessionActivityAttributes() {}

    private static class SingletonHelper{
        private static final SessionActivityAttributes INSTANCE = new SessionActivityAttributes();
    }

    public static SessionActivityAttributes getInstance(){
        return SingletonHelper.INSTANCE;
    }

    Map<Integer, PositionDTO> sessionAttributes = new HashMap<>();

    public void createSession(Integer deviceId, PositionDTO lastPosition){
        sessionAttributes.put(deviceId, lastPosition);
    }

    public boolean hasRefreshed(Integer deviceId, PositionDTO lastPosition){
        return !sessionAttributes.get(deviceId).equals(lastPosition);
    }

    public PositionDTO getLastPosition(Integer deviceId){
        return sessionAttributes.get(deviceId);
    }

}
