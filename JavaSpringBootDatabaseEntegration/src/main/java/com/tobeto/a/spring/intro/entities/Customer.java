package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "customers")
@Entity

public class Customer {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "identity_number")
    private String identityNumber;

    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "customers")
    private List<Order> orders;

    @OneToMany(mappedBy = "customersBill")
    private List<Bill> bills;

    @OneToMany(mappedBy = "customers")
    private List<Address> addresses;

}
