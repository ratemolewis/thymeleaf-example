package com.zalego.io.demo.entities;

import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name ="Menu" )

public class Menu extends BaseEntity {
    @Column(name= "menu")
    private String menu;
    @Column(name= "menuDate")
    private LocalDateTime date;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name= "hotel_id")
    @JsonProperty("hotel_id")
    @JsonMerge
    private Hotel hotel_id;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "menu_id")
    @JsonProperty("dishes")
    @JsonMerge
    private List<Dishes> dishes;



    public List<Dishes> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dishes> dishes) {
        this.dishes = dishes;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Hotel getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Hotel hotel_id) {
        this.hotel_id = hotel_id;
    }
}
