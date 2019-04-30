package com.sketstar.filesharing.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class User extends BaseEntity {

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(unique = true)
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "Role")
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Role> roles;

    @Column(name = "email")
    private String email;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}