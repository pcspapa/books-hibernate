package com.cspark.books.hibernate.auction.model;

/**
 * Created by cspark on 2016. 1. 7..
 */
public class Address {

    private String street;

    private String zipcode;

    private String city;

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
