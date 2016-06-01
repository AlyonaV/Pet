package mvc.persistence.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "GEOFENCE")
public class Geofence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min=3, max=50)
    @Column(name = "NAME", nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name="DEVICEID")
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

    public Geofence() {
    }

    public Geofence(String name, Device device, Integer latG, Integer latM, Integer latMm, Integer longG, Integer longM, Integer longMm) {
        this.name = name;
        this.device = device;
        this.latG = latG;
        this.latM = latM;
        this.latMm = latMm;
        this.longG = longG;
        this.longM = longM;
        this.longMm = longMm;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Geofence)) return false;

        Geofence geofence = (Geofence) o;

        if (!device.equals(geofence.device)) return false;
        if (!id.equals(geofence.id)) return false;
        if (!latG.equals(geofence.latG)) return false;
        if (!latM.equals(geofence.latM)) return false;
        if (!latMm.equals(geofence.latMm)) return false;
        if (!longG.equals(geofence.longG)) return false;
        if (!longM.equals(geofence.longM)) return false;
        if (!longMm.equals(geofence.longMm)) return false;
        if (!name.equals(geofence.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + device.hashCode();
        result = 31 * result + latG.hashCode();
        result = 31 * result + latM.hashCode();
        result = 31 * result + latMm.hashCode();
        result = 31 * result + longG.hashCode();
        result = 31 * result + longM.hashCode();
        result = 31 * result + longMm.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Geofence{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", device=" + device +
                ", latG=" + latG +
                ", latM=" + latM +
                ", latMm=" + latMm +
                ", longG=" + longG +
                ", longM=" + longM +
                ", longMm=" + longMm +
                '}';
    }
}

