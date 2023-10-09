package com.customer.application.Customerms.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "Customer Name")
    private String customerName;

    @Column(name = "E-Mail")
    private String email;

    @Column(name = "Native Place")
    private String place;

    @Column(name = "Phone Number")
    private long phnumber;
}
