package com.customer.application.Customerms.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class Customerdto {

    private String name;

    private String email;

    private String place;

    private long phnumber;
}
