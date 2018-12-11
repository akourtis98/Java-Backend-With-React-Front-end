/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alexkourtis11
 */
@Entity
@Table(name="cart")
public class Cart implements Serializable{

    public Cart(){};

    public Cart(int user_id) {
        this.user_id = user_id;
    }

    @Column(name="id")
    @Id
    private int id;

    @Column(name = "user_id")
    private int user_id;

    public int getUser_id {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


}
