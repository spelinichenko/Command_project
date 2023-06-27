package com.company.bookstore.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "BOOKSTORE_GENRE")
@Entity(name = "bookstore_Genre")
public class Genre extends StandardEntity {
    private static final long serialVersionUID = -5578492988815148727L;

    @NotNull
    @Column(name="NAME")
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}