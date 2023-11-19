package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Table(name = "orders")
@Entity
public class Order {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "end_rent")
    private LocalDate endRent;

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "payment_type")
    private String paymentType;

    @Column(name = "start_rent")
    private LocalDate startRent;

    //car_id
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car cars;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customers;

    @OneToMany(mappedBy = "orders")
    private List<Bill> bills;
}
