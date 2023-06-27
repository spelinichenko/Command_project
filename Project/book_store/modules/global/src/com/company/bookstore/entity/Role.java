package com.company.bookstore.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "BOOKSTORE_ROLE")
@Entity(name = "bookstore_Role")
@NamePattern("%s|name")
public class Role extends StandardEntity {
    private static final long serialVersionUID = -3042920817148802214L;

    @NotNull
    @Column(name = "NAME")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}