package com.zalego.io.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name= "Hotel")
public class Hotel extends BaseEntity {
    @Column(name="name")
    private String name;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="location",nullable = false)
    @JsonProperty("location")
    @JsonMerge
    private Location location;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private BigInteger phone;
    @Column(name="description")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="hotel_Menu",nullable = true)
    private Menu hotel_Menu;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="user",nullable = false)
    @JsonProperty("user")
    @JsonMerge
    private Users user;

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getPhone() {
        return phone;
    }

    public void setPhone(BigInteger phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Menu getHotel_Menu() {
        return hotel_Menu;
    }

    public void setHotel_Menu(Menu hotel_Menu) {
        this.hotel_Menu = hotel_Menu;
    }
}
