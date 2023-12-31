package com.droneland.droneland;

import jakarta.persistence.*;

@Entity
public class Drone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;

    public Drone(){}


    public Drone(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){return name;}

    public int getPrice(){return price;}
    public void setPrice(int price) {
        this.price = price;
    }
}
