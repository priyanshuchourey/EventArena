package com.example.polls.model;

import javax.persistence.*;


@Entity
@Table(name="city")
public class City{

    @Id
    @GeneratedValue(generator = "id_generator")
    @SequenceGenerator(
            name = "id_generator",
            sequenceName = "id_sequence",
            initialValue = 1000
    )
    
    @Column(name="name")
    String name;

}