package com.company.bookstore.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "BOOKSTORE_STAFF")
@Entity(name = "bookstore_Staff")
@NamePattern("%s %s|lastName,firstName")
public class Staff extends StandardEntity {
    private static final long serialVersionUID = -6132455387775702101L;

    @NotNull
    @Column(name = "FIRST_NAME")
    private String firstName;

    @NotNull
    @Column(name = "LAST_NAME")
    private String lastName;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROLE_ID")
    private Role role;

    @NotNull
<<<<<<< HEAD
    @Column(name = "LOGIN")
=======
    @Column(name = "LOGIN", unique = true)
>>>>>>> 5cece3a83f98907bc2ac9ce547d91087a4cafa2e
    private String login;

    @NotNull
    @Column(name = "PASSWORD")
    private String password;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}