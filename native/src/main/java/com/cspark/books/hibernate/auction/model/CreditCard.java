package com.cspark.books.hibernate.auction.model;

/**
 * Created by cspark on 2016. 1. 7..
 */
public class CreditCard extends BillingDeatils {

    private Long id;

    private String number;

    private String expMonth;

    private String expYear;

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    public String getExpYear() {
        return expYear;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }
}
