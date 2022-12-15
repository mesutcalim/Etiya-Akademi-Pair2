package com.etiya.ecommercedemopair2.business.dtos.response.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddOrderResponse {
    private int id;
    private Date order_date;
    private Date ship_date;
    private int shipper_id;
    private int payment_id;
    private int customer_id;
}
