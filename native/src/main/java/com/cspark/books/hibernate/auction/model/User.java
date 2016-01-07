package com.cspark.books.hibernate.auction.model;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 * Created by cspark on 2016. 1. 6..
 */
public class User implements Serializable {

    private String firstname;

    private String lastname;

    private Address address;

    public User() {
    }

    public String getName() {
        return firstname + " " + lastname;
    }

    public void setName(String name) {
        StringTokenizer t = new StringTokenizer(name);
        firstname = t.nextToken();
        lastname = t.nextToken();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public MonetaryAmount calcShippingCosts(Address formLocation) {
        return null;
    }
}
