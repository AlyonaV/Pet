package mvc.persistence.dto;

import mvc.persistence.model.Activity;
import org.joda.time.LocalDate;

import java.util.Date;

/**
 * Created by Alona on 02.06.2016.
 */
public class PositionDTO {
    private Integer lat;
    private Integer lon;
    private Integer latG;
    private Integer latM;
    private Integer latMm;
    private Integer longG;
    private Integer longM;
    private Integer longMm;
    private Date time;

    public PositionDTO() {
    }

    public PositionDTO(Activity pos){
        this.lat = pos.getLat();
        this.lon = pos.getLon();
        this.latG = pos.getLatG();
        this.latM = pos.getLatM();
        this.latMm = pos.getLatMm();
        this.longG = pos.getLongG();
        this.longM = pos.getLongM();
        this.longMm = pos.getLongMm();
        this.time = pos.getTime();
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Integer getLon() {
        return lon;
    }

    public void setLon(Integer lon) {
        this.lon = lon;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionDTO)) return false;

        PositionDTO that = (PositionDTO) o;

        if (!lat.equals(that.lat)) return false;
        if (!latG.equals(that.latG)) return false;
        if (!latM.equals(that.latM)) return false;
        if (!latMm.equals(that.latMm)) return false;
        if (!lon.equals(that.lon)) return false;
        if (!longG.equals(that.longG)) return false;
        if (!longM.equals(that.longM)) return false;
        if (!longMm.equals(that.longMm)) return false;
        if (!time.equals(that.time)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lat.hashCode();
        result = 31 * result + lon.hashCode();
        result = 31 * result + latG.hashCode();
        result = 31 * result + latM.hashCode();
        result = 31 * result + latMm.hashCode();
        result = 31 * result + longG.hashCode();
        result = 31 * result + longM.hashCode();
        result = 31 * result + longMm.hashCode();
        result = 31 * result + time.hashCode();
        return result;
    }
}
