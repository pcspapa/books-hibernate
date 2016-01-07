package com.cspark.books.hibernate.auction.model;

import javax.persistence.*;

/**
 * Created by cspark on 2016. 1. 7..
 */
@Entity
@Table(name = "USER")
public class User {

    private Long id;

    private String firstname;

    private String lastname;

    private String username;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "HOME_STREET")),
            @AttributeOverride(name = "zipcode", column = @Column(name = "HOME_ZIPCODE")),
            @AttributeOverride(name = "city", column = @Column(name = "HOME_CITY"))
    })
    private Address homeAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "BILLING_STREET")),
            @AttributeOverride(name = "zipcode", column = @Column(name = "BILLING_ZIPCODE")),
            @AttributeOverride(name = "city", column = @Column(name = "BILLING_CITY"))
    })
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
