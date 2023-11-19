package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "addresses")
@Entity
public class Address {
    @Id
    @Column(name = "id")
    private int id;

    //customer_id
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customers;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "address_text")
    private String addressText;

    //city_id
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City cities;

    //country_id
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country countries;

    @OneToMany(mappedBy = "addresses")
    private List<Bill> bills;
}
