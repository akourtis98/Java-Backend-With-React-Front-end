/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entities;

import com.app.entities.dao.*;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author alexkourtis11
 */
@Entity
@Table(name = "skins")
public class Products implements Serializable {

    public Products() {
    }

    public Products(int id, String pic_location, String skin_name, String category, int price, String description) {
        this.id = id;
        this.pic_location = pic_location;
        this.skin_name = skin_name;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="pic_location")
    private String pic_location;

    @Column(name = "skin_name")
    private String skin_name;

    @Column(name = "category")
    private String category;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkin_name() {
        return skin_name;
    }

    public void setSkin_name(String skin_name) {
        this.skin_name = skin_name;
    }

    public String getCreator_uname() {
        return creator_uname;
    }

    public void setCreator_uname(String creator_uname) {
        this.creator_uname = creator_uname;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Products{" +
                "id=" + id +
                ", pic_location='" + pic_location + '\'' +
                ", skin_name='" + skin_name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}