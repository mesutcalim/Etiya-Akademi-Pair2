package com.etiya.ecommercedemopair2.business.dtos.request.shipper;

import com.etiya.ecommercedemopair2.business.constants.Messages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddShipperRequest {
    @NotNull(message = Messages.Common.NameFieldCantBeEmpty)
    @NotBlank(message = Messages.Common.NameFieldCantBeEmpty)
    private String company_name;
    @NotNull(message = "Telefon numarası boş bırakılamaz!")
    private String phone_number;
    @Min(value=1,message = "role_id "+Messages.Common.IdFieldNeedsToBeMinOne)
    private int roleId;
}
