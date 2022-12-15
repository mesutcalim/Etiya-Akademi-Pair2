package com.etiya.ecommercedemopair2.business.dtos.request.paymentMethod;

import com.etiya.ecommercedemopair2.business.constants.Messages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddPaymentMethodRequest {
    @NotNull(message = Messages.Common.NameFieldCantBeEmpty)
    @NotBlank(message = Messages.Common.NameFieldCantBeEmpty)
    private String name;

}
