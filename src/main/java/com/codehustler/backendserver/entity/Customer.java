package com.codehustler.backendserver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "cust_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "status")
    private String status;

    @Column(name = "country")
    private String country;

    @Column(name = "age")
    private int age;

    @Column(name = "Cust_Sex")
    private String sex;

    @Column(name = "Join_Dt")
    private String joiningDate;

    @Column(name = "Is_New_Cust")
    private boolean isNewCustomer;

    @Column(name = "addressType")
    private String addressType;
}
