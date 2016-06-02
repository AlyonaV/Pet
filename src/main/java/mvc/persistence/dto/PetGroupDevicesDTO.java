package mvc.persistence.dto;

import mvc.persistence.model.Pet;
import mvc.persistence.model.PetGroup;
import mvc.persistence.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alona on 02.06.2016.
 */
public class PetGroupDevicesDTO {
    private Integer id;
    private String name;
    private User user;
    private List<PetDevicesDTO> pets = new ArrayList<PetDevicesDTO>();

    public PetGroupDevicesDTO() {
    }

    public PetGroupDevicesDTO(PetGroup petGroup, List<PetDevicesDTO> petDevicesDTOs) {
        this.id = petGroup.getId();
        this.name = petGroup.getName();
        this.user = petGroup.getUser();
        this.pets = petDevicesDTOs;
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

    public List<PetDevicesDTO> getPets() {
        return pets;
    }

    public void setPets(List<PetDevicesDTO> pets) {
        this.pets = pets;
    }
}
