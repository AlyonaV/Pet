package mvc.persistence.dto;


import java.io.Serializable;
import java.util.Date;

public class Tk103SentenceDTO implements Serializable{
    private Integer id;
    private Date timestamp;

    private Boolean valid;

    private Integer lonG;
    private Integer lonM;
    private Integer lonMm;
    private Integer latG;
    private Integer latM;
    private Integer latmm;

    private Double speed;
    private Double course;
    private Double altitude;

    private Double signalLevel;
    private Integer fixCount;

    private Double batteryLevel;
    private Boolean charging;

    private String imei;

    public Tk103SentenceDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Integer getLonG() {
        return lonG;
    }

    public void setLonG(Integer lonG) {
        this.lonG = lonG;
    }

    public Integer getLonM() {
        return lonM;
    }

    public void setLonM(Integer lonM) {
        this.lonM = lonM;
    }

    public Integer getLonMm() {
        return lonMm;
    }

    public void setLonMm(Integer lonMm) {
        this.lonMm = lonMm;
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

    public Integer getLatmm() {
        return latmm;
    }

    public void setLatmm(Integer latmm) {
        this.latmm = latmm;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getCourse() {
        return course;
    }

    public void setCourse(Double course) {
        this.course = course;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Double getSignalLevel() {
        return signalLevel;
    }

    public void setSignalLevel(Double signalLevel) {
        this.signalLevel = signalLevel;
    }

    public Integer getFixCount() {
        return fixCount;
    }

    public void setFixCount(Integer fixCount) {
        this.fixCount = fixCount;
    }

    public Double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(Double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Boolean getCharging() {
        return charging;
    }

    public void setCharging(Boolean charging) {
        this.charging = charging;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Tk102SentenceDTO{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", valid=" + valid +
                ", lonG=" + lonG +
                ", lonM=" + lonM +
                ", lonMm=" + lonMm +
                ", latG=" + latG +
                ", latM=" + latM +
                ", latmm=" + latmm +
                ", speed=" + speed +
                ", course=" + course +
                ", altitude=" + altitude +
                ", signalLevel=" + signalLevel +
                ", fixCount=" + fixCount +
                ", batteryLevel=" + batteryLevel +
                ", charging=" + charging +
                ", imei='" + imei + '\'' +
                '}';
    }
}
