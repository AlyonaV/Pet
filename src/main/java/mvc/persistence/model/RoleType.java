package mvc.persistence.model;

/**
 * Created by Alona on 21.05.2016.
 */
public enum RoleType {

    USER("USER"),
    ADMIN("ADMIN"),
    OWNER("OWNER"),
    VET("VET");

    String roleType;

    RoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleType() {
        return roleType;
    }
}
