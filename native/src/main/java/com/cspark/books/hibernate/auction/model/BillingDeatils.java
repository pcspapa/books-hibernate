package com.cspark.books.hibernate.auction.model;

/**
 * Created by cspark on 2016. 1. 7..
 */
public abstract class BillingDeatils {


    /**
     * for union-subclass, subclass
     */
    private Long id;

    private String owner;

    public Long getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
