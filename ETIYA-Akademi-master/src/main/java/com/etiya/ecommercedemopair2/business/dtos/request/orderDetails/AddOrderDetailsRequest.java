package com.etiya.ecommercedemopair2.business.dtos.request.orderDetails;

import com.etiya.ecommercedemopair2.business.constants.Messages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddOrderDetailsRequest {
    @Min(value=1,message = "orderId "+ Messages.Common.IdFieldNeedsToBeMinOne)
    private int orderId;

    private List<Integer> productId;
    private double total;
    private String coupon;
}
