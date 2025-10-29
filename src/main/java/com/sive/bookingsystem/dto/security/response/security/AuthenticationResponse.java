package com.sive.bookingsystem.dto.security.response.security;

import com.sive.bookingsystem.dto.profile.RoleDTO;
import java.util.Set;

public class AuthenticationResponse {
    private String token, title, name, surname, email, cellphone, password, confirmPassword;
    private Set<RoleDTO> roles;

    public AuthenticationResponse(String token, String title, String name, String surname, String email, String cellphone, String password, String confirmPassword, Set<RoleDTO> roles) {
        this.token = token;
        this.title = title;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.cellphone = cellphone;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.roles = roles;
    }

    public AuthenticationResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
    }
}