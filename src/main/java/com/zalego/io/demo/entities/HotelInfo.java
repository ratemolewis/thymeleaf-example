package com.zalego.io.demo.entities;

import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "hotelInfo")
public class HotelInfo extends BaseEntity{

    @Transient
    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonMerge
    @JoinColumn(name="user",nullable = false)
    @JsonProperty("user")
    private Users user;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="location",nullable = false)
    @JsonProperty("location")
    @JsonMerge
    private Location location;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
