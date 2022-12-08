package com.etiya.ecommercedemopair2.business.dtos.request.customer;

import com.etiya.ecommercedemopair2.business.constants.Messages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddCustomerRequest {
    @Min(value=1,message = "payment_id "+ Messages.Id.IdFieldNeedsToBeMinOne)
    private int paymentId;
    @Min(value=1,message = "role_id "+Messages.Id.IdFieldNeedsToBeMinOne)
    private int roleId;
    @Min(value=1,message = "user_id "+Messages.Id.IdFieldNeedsToBeMinOne)
    private int userId;
}
