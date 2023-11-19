package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "bills")
@Entity
public class Bill {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private LocalDate date;


    @Column(name = "price")
    private Double price;

    //address_id
    //customer id
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customersBill;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orders;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address addresses;
}

