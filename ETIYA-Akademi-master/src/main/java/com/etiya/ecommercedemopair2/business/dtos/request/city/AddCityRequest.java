package com.etiya.ecommercedemopair2.business.dtos.request.city;

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
public class AddCityRequest {
    @NotNull(message = Messages.Common.NameFieldCantBeEmpty)
    @NotBlank(message = Messages.Common.NameFieldCantBeEmpty)
    private String city_name;
    @Min(value = 1,message = "country_id"+ Messages.Common.IdFieldNeedsToBeMinOne)
    private int countryId;
}
