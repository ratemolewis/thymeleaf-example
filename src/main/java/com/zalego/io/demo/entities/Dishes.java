package com.zalego.io.demo.entities;

import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "Dishes")
public class Dishes extends BaseEntity {
    @Column(name = "name")
    @JsonProperty("name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "dishes")
    @JsonProperty("menu_id")
    @JsonMerge
    private Menu menu_id;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Menu getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Menu menu_id) {
        this.menu_id = menu_id;
    }
}
