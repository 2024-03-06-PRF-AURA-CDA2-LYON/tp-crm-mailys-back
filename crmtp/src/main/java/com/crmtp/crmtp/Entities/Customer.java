package com.crmtp.crmtp.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(name="company_name", length=100,nullable = false)
    private String company_name;

    @Column(name= "first_name", length=50, nullable = false)
    private String first_name;

    @Column(name= "last_name", length=50, nullable = false)
    private String last_name;

    @Column(name= "email", length=100, nullable = false, unique = true)
    private String email;

    @Column(name= "phone_number", length=15, unique = true)
    private String phone_number;

    @Column(name="address", columnDefinition = "TEXT",nullable = false)
    private String address;

    @Column(name= "zip_code", length=30,nullable = false)
    private String zip_code;

    @Column(name= "country", length=100, nullable = false)
    private String country;

    @Column(name= "city", length=100, nullable = false)
    private String city;

    @Column(name="state")
    private Integer state;

}
