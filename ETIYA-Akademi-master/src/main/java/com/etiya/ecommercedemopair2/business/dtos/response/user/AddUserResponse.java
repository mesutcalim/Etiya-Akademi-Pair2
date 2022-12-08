package com.etiya.ecommercedemopair2.business.dtos.response.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddUserResponse {
    private int id;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String email;
    private String password;
    private int address_id;
    private Date birth_date;
}
