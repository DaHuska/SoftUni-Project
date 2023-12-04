package org.softuni.luxwatches.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "watches")
public class Watch extends BaseEntity {
    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private BigDecimal price;

    @Column
    private Integer count;
}

