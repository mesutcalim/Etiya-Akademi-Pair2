package com.etiya.ecommercedemopair2.business.dtos.request.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddOrderRequest {
    private Date order_date;
    private Date ship_date;
    private int shipper_id;
    private int payment_id;
    private int customer_id;

}
