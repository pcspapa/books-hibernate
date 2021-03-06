package com.cspark.books.hibernate.auction.model;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 * Created by cspark on 2016. 1. 6..
 */
public class User implements Serializable {

    private Long id;

    private String firstname;

    private String lastname;

    private String username;

    private Address homeAddress;

    private Address billingAddress;

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}
