package mvc.persistence.model;

import javax.persistence.*;

@Entity
@Table(name="role")
public class Protocol {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name", unique = true,nullable = false)
    private String name;

    public Protocol() {
    }

    public Protocol(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Protocol)) return false;

        Protocol protocol = (Protocol) o;

        if (!id.equals(protocol.id)) return false;
        if (!name.equals(protocol.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Protocol{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
