package com.cspark.books.hibernate.auction.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * for class
 * @Entity
 *
 * for union-subclass
 * @Entity
 *
 * for subclass
 * @Entity
 * @DiscriminatorValue("CC")
 *
 * for joined-class
 * @Entity
 * option : @PrimaryKeyJoinColumn(name = "CREDIT_CARD_ID")
 *
 * Created by cspark on 2016. 1. 7..
 */
@Entity
public class CreditCard extends BillingDeatils {

    /**
     * for class
     */
    @Id
    @GeneratedValue
    @Column(name = "CREDIT_CARD_ID")
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
