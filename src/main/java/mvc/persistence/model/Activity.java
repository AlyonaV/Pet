package mvc.persistence.model;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "activity")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min=3, max=50)
    @Column(name = "name", nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name="deviceid")
    private Device device;
    @Column(name="LatG",nullable=false)
    private Integer latG;
    @Column(name="LatM",nullable=false)
    private Integer latM;
    @Column(name="LatMm",nullable=false)
    private Integer latMm;
    @Column(name="LongG",nullable=false)
    private Integer longG;
    @Column(name="LongM",nullable=false)
    private Integer longM;
    @Column(name="LongMm",nullable=false)
    private Integer longMm;
    @NotNull
    @DateTimeFormat(pattern="HH:mm:ss-dd/MM/yyyy")
    @Column(name = "time", nullable = false)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate time;

    public Activity() {
    }

    public Activity(String name, Device device, Integer latG, Integer latM, Integer latMm, Integer longG, Integer longM, Integer longMm, LocalDate time) {
        this.name = name;
        this.device = device;
        this.latG = latG;
        this.latM = latM;
        this.latMm = latMm;
        this.longG = longG;
        this.longM = longM;
        this.longMm = longMm;
        this.time = time;
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

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Integer getLatG() {
        return latG;
    }

    public void setLatG(Integer latG) {
        this.latG = latG;
    }

    public Integer getLatM() {
        return latM;
    }

    public void setLatM(Integer latM) {
        this.latM = latM;
    }

    public Integer getLatMm() {
        return latMm;
    }

    public void setLatMm(Integer latMm) {
        this.latMm = latMm;
    }

    public Integer getLongG() {
        return longG;
    }

    public void setLongG(Integer longG) {
        this.longG = longG;
    }

    public Integer getLongM() {
        return longM;
    }

    public void setLongM(Integer longM) {
        this.longM = longM;
    }

    public Integer getLongMm() {
        return longMm;
    }

    public void setLongMm(Integer longMm) {
        this.longMm = longMm;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;

        Activity activity = (Activity) o;

        if (!device.equals(activity.device)) return false;
        if (!id.equals(activity.id)) return false;
        if (!latG.equals(activity.latG)) return false;
        if (!latM.equals(activity.latM)) return false;
        if (!latMm.equals(activity.latMm)) return false;
        if (!longG.equals(activity.longG)) return false;
        if (!longM.equals(activity.longM)) return false;
        if (!longMm.equals(activity.longMm)) return false;
        if (name != null ? !name.equals(activity.name) : activity.name != null) return false;
        if (!time.equals(activity.time)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + device.hashCode();
        result = 31 * result + latG.hashCode();
        result = 31 * result + latM.hashCode();
        result = 31 * result + latMm.hashCode();
        result = 31 * result + longG.hashCode();
        result = 31 * result + longM.hashCode();
        result = 31 * result + longMm.hashCode();
        result = 31 * result + time.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", device=" + device +
                ", latG=" + latG +
                ", latM=" + latM +
                ", latMm=" + latMm +
                ", longG=" + longG +
                ", longM=" + longM +
                ", longMm=" + longMm +
                ", time=" + time +
                '}';
    }
}
