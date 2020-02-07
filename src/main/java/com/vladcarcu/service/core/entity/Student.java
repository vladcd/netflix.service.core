package com.vladcarcu.service.core.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String location;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public String getIdName() {
        return new StringBuilder()
                .append(id)
                .append(" ")
                .append(name)
                .toString();
    }
}
