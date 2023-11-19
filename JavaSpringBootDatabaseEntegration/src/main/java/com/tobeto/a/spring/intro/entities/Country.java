package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import org.springframework.core.SpringVersion;

import java.util.List;

@Table(name = "countries")
@Entity
public class Country {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "countries")
    private List<City> cities;

    @OneToMany(mappedBy = "countries")
    private List<Address> addresses;
}
