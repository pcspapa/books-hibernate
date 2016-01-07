package com.cspark.books.hibernate.auction.model;

import javax.persistence.*;

/**
 * for class
 * @Entity
 *
 * for union-subclass
 * @Entity
 *
 * for subclass
 * @Entity
 * @DiscriminatorValue("BA")
 *
 * for joined-class
 * @Entity
 * option : @PrimaryKeyJoinColumn(name = "BANK_ACCOUNT_ID")
 *
 * Created by cspark on 2016. 1. 7..
 */
@Entity
public class BankAccount extends BillingDeatils {

    /**
     * for class
     */
    @Id
    @GeneratedValue
    @Column(name = "BANK_ACCOUNT_ID")
    private Long id;

    private String account;

    private String bankname;

    private String swift;

    public Long getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }
}
