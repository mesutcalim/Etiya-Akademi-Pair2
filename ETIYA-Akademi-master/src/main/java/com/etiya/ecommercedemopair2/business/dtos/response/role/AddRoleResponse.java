package com.etiya.ecommercedemopair2.business.dtos.response.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddRoleResponse {
    private int id;
    private String role_name;
}
