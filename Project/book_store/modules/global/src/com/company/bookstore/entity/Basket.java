package com.company.bookstore.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "BOOKSTORE_BASKET")
@Entity(name = "bookstore_Basket")
public class Basket extends StandardEntity {
    private static final long serialVersionUID = 6145929935260163644L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    /*private Book book;*/

    @NotNull
    @Column(name = "COUNT")
    private Integer count;

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}