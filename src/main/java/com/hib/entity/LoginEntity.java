package com.hib.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Login")
public class LoginEntity {
    @Id
    @Column(length = 100)
    private String name;
    @Column(length = 100)
    private String password;

    public LoginEntity(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public LoginEntity() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "User [name=" + name + ", password=" + password + "]";
    }
}
