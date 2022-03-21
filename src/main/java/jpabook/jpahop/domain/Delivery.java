package jpabook.jpahop.domain;

import javax.persistence.*;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String city;

    private String street;

    private String zipcode;

    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;
}
