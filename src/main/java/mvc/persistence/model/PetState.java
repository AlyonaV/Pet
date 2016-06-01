package mvc.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "PETSTATE")
public class PetState {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "WEIGHT")
    private Integer weight;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "PULSE")
    private Integer pulse;
    @Column(name = "WATER")
    private String water;
    @Column(name = "EYES")
    private String eyes;
    @Column(name = "TEETH")
    private String teeth;
    @Column(name = "DRUGS")
    private String drugs;
    @Column(name = "APPETITE")
    private String appetite;

    public PetState() {
    }

    public PetState(Integer weight, Integer age, Integer pulse, String water, String eyes, String teeth, String drugs, String appetite) {
        this.weight = weight;
        this.age = age;
        this.pulse = pulse;
        this.water = water;
        this.eyes = eyes;
        this.teeth = teeth;
        this.drugs = drugs;
        this.appetite = appetite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getTeeth() {
        return teeth;
    }

    public void setTeeth(String teeth) {
        this.teeth = teeth;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public String getAppetite() {
        return appetite;
    }

    public void setAppetite(String appetite) {
        this.appetite = appetite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PetState)) return false;

        PetState petState = (PetState) o;

        if (age != null ? !age.equals(petState.age) : petState.age != null) return false;
        if (appetite != null ? !appetite.equals(petState.appetite) : petState.appetite != null) return false;
        if (drugs != null ? !drugs.equals(petState.drugs) : petState.drugs != null) return false;
        if (eyes != null ? !eyes.equals(petState.eyes) : petState.eyes != null) return false;
        if (!id.equals(petState.id)) return false;
        if (pulse != null ? !pulse.equals(petState.pulse) : petState.pulse != null) return false;
        if (teeth != null ? !teeth.equals(petState.teeth) : petState.teeth != null) return false;
        if (water != null ? !water.equals(petState.water) : petState.water != null) return false;
        if (weight != null ? !weight.equals(petState.weight) : petState.weight != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (pulse != null ? pulse.hashCode() : 0);
        result = 31 * result + (water != null ? water.hashCode() : 0);
        result = 31 * result + (eyes != null ? eyes.hashCode() : 0);
        result = 31 * result + (teeth != null ? teeth.hashCode() : 0);
        result = 31 * result + (drugs != null ? drugs.hashCode() : 0);
        result = 31 * result + (appetite != null ? appetite.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PetState{" +
                "id=" + id +
                ", weight=" + weight +
                ", age=" + age +
                ", pulse=" + pulse +
                ", water='" + water + '\'' +
                ", eyes='" + eyes + '\'' +
                ", teeth='" + teeth + '\'' +
                ", drugs='" + drugs + '\'' +
                ", appetite='" + appetite + '\'' +
                '}';
    }
}
