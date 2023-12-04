package org.softuni.luxwatches.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "brands")
public class Brand extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @OneToMany
    private List<Watch> watches;
}
