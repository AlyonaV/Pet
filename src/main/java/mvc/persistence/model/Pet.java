package mvc.persistence.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PET")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min=3, max=50)
    @Column(name = "NAME", nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name="PETSTATEID")
    private PetState petState;
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "PETGROUP_PET",
            joinColumns = { @JoinColumn(name = "PETID") },
            inverseJoinColumns = { @JoinColumn(name = "PETGROUPID") })
    private List<PetGroup> petGroups = new ArrayList<PetGroup>();

    public Pet() {
    }

    public Pet(String name, PetState petState, List<PetGroup> petGroups) {
        this.name = name;
        this.petState = petState;
        this.petGroups = petGroups;
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

    public PetState getPetState() {
        return petState;
    }

    public void setPetState(PetState petState) {
        this.petState = petState;
    }

    public List<PetGroup> getPetGroups() {
        return petGroups;
    }

    public void setPetGroups(List<PetGroup> petGroups) {
        this.petGroups = petGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;

        Pet pet = (Pet) o;

        if (!id.equals(pet.id)) return false;
        if (!name.equals(pet.name)) return false;
        if (!petGroups.equals(pet.petGroups)) return false;
        if (petState != null ? !petState.equals(pet.petState) : pet.petState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (petState != null ? petState.hashCode() : 0);
        result = 31 * result + petGroups.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", petState=" + petState +
                ", petGroups=" + petGroups +
                '}';
    }


}
