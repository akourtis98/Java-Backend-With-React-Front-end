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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author alexkourtis11
 */
@Entity
@Table(name = "user")
public class User implements Serializable {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "cart_id")
    private int cart_id;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public User() {
    }

    public User(String username, String password, int cart_id) {
        this.username = username;
        this.cart_id = cart_id;
        this.password = "{noop}" + password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", cart_id=" + cart_id +
                ", id=" + id +
                '}';
    }
}