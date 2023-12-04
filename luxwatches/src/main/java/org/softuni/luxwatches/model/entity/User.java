package org.softuni.luxwatches.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.softuni.luxwatches.model.enums.UserRole;

import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Column(unique = true, nullable = false)
    @Length(min = 3, max = 20)
    private String username;

    @Column(nullable = false)
    private String password;

    @Email
    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private UserRole role;

    @OneToMany
    private List<Watch> boughtWatches;
}