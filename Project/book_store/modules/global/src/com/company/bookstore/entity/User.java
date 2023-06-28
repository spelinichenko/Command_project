package com.company.bookstore.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Extends;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity(name = "bookstore_User")
@NamePattern("%s %s|lastName,firstName")
@Extends(com.haulmont.cuba.security.entity.User.class)
public class User extends com.haulmont.cuba.security.entity.User {
    private static final long serialVersionUID = -2254311993652503928L;

    @NotNull
    @Column(name = "BALANCE", nullable = false)
    private Double balance;

    @Column(name = "DAY_OF_BIRTH")
    private LocalDate dayOfBirth;

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }
}