package com.cspark.books.hibernate.auction.model;

import javax.persistence.*;

/**
 * for class
 * @MappedSuperclass
 *
 * for union-subclass
 * @Entity
 * @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
 *
 * for subclass
 * @Entity
 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
 * @DiscriminatorColumn(
 *         name = "BILLING_DETAILS_TYPE",
 *         discriminatorType = DiscriminatorType.STRING
 * )
 *
 * for joined-subclass
 * @Entity
 * @Inheritance(strategy = InheritanceType.JOINED)
 *
 * Created by cspark on 2016. 1. 7..
 */
@MappedSuperclass
public abstract class BillingDeatils {

//    for union-subclass, subclass, joined-class
//
//    @Id
//    @GeneratedValue
//    @Column(name = "BILLING_DETAILS_ID")
//    private Long id;

    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
