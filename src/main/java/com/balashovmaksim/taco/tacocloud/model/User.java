package com.balashovmaksim.taco.tacocloud.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@Table(name = "users")
@RequiredArgsConstructor
@SuperBuilder
public class User{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String fullname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String username, String encode, String fullname, String street, String city, String state, String zip, String phone, Role role) {
        this.username = username;
        this.password = encode;
        this.fullname = fullname;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phone;
        this.role = role;
    }
}
