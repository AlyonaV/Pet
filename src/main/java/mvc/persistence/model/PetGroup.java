package mvc.persistence.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PETGROUP")
public class PetGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min=3, max=50)
    @Column(name = "NAME", unique=true, nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name="USERID")
    private User user;
    @NotEmpty
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "PETGROUP_PET",
            joinColumns = { @JoinColumn(name = "PETGROUPID") },
            inverseJoinColumns = { @JoinColumn(name = "PETID") })
    private List<Pet> pets = new ArrayList<Pet>();

    public PetGroup() {
    }

    public PetGroup(String name, User user, List<Pet> pets) {
        this.name = name;
        this.user = user;
        this.pets = pets;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PetGroup)) return false;

        PetGroup petGroup = (PetGroup) o;

        if (!id.equals(petGroup.id)) return false;
        if (!name.equals(petGroup.name)) return false;
        if (!pets.equals(petGroup.pets)) return false;
        if (!user.equals(petGroup.user)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + user.hashCode();
        result = 31 * result + pets.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PetGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                ", pets=" + pets +
                '}';
    }
}
