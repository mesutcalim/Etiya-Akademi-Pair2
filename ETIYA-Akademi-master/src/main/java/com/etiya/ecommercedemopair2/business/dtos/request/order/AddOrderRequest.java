package com.etiya.ecommercedemopair2.business.dtos.request.order;

import com.etiya.ecommercedemopair2.business.constants.Messages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddOrderRequest {
    private Date order_date;
    private Date ship_date;
    @Min(value=1,message = "shipper_id "+ Messages.Common.IdFieldNeedsToBeMinOne)
    private int shipperId;
    @Min(value=1,message = "payment_id "+Messages.Common.IdFieldNeedsToBeMinOne)
    private int paymentMethodId;
    @Min(value=1,message = "customer_id "+Messages.Common.IdFieldNeedsToBeMinOne)
    private int customerId;

}
