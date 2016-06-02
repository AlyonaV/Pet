package mvc.persistence.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min=3, max=50)
    @Column(name = "name", nullable = false)
    private String name;
    @Size(min=10, max=15)
    @Column(name = "imei", unique=true,nullable = false)
    private String imei;
    @Column(name = "sendinginterval", nullable = false)
    private String sendingInterval;
    @Column(name = "isactive", nullable = false)
    private boolean isActive;
    @Column(name = "battery", nullable = false)
    private Integer battery;
    @ManyToOne
    @JoinColumn(name="statusid")
    private Status status;
    @ManyToOne
    @JoinColumn(name="protoid")
    private Protocol protocol;
    @NotEmpty
    @ManyToOne
    @JoinColumn(name="petid")
    private Pet pet;

    public Device() {
    }

    public Device(String name, String imei, String sendingInterval, boolean isActive, Integer battery, Status status, Protocol protocol, Pet pet) {
        this.name = name;
        this.imei = imei;
        this.sendingInterval = sendingInterval;
        this.isActive = isActive;
        this.battery = battery;
        this.status = status;
        this.protocol = protocol;
        this.pet = pet;
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

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getSendingInterval() {
        return sendingInterval;
    }

    public void setSendingInterval(String sendingInterval) {
        this.sendingInterval = sendingInterval;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (isActive != device.isActive) return false;
        if (!battery.equals(device.battery)) return false;
        if (!id.equals(device.id)) return false;
        if (!imei.equals(device.imei)) return false;
        if (!name.equals(device.name)) return false;
        if (!pet.equals(device.pet)) return false;
        if (protocol != null ? !protocol.equals(device.protocol) : device.protocol != null) return false;
        if (!sendingInterval.equals(device.sendingInterval)) return false;
        if (status != null ? !status.equals(device.status) : device.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + imei.hashCode();
        result = 31 * result + sendingInterval.hashCode();
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + battery.hashCode();
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (protocol != null ? protocol.hashCode() : 0);
        result = 31 * result + pet.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imei='" + imei + '\'' +
                ", sendingInterval='" + sendingInterval + '\'' +
                ", isActive=" + isActive +
                ", battery=" + battery +
                ", status=" + status +
                ", protocol=" + protocol +
                ", pet=" + pet +
                '}';
    }


}
