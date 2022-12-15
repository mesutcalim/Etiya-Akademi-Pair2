package com.etiya.ecommercedemopair2.business.dtos.request.user;

import com.etiya.ecommercedemopair2.business.constants.Messages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AddUserRequest {
    @NotNull(message = Messages.Common.NameFieldCantBeEmpty)
    @NotBlank(message = Messages.Common.NameFieldCantBeEmpty)
    private String first_name;
    @NotNull(message = Messages.Common.NameFieldCantBeEmpty)
    @NotBlank(message = Messages.Common.NameFieldCantBeEmpty)
    private String last_name;
    @NotNull(message = "Telefon numarası boş bırakılamaz!")
    private String phoneNumber;
    @NotNull(message = "E mail alanı boş bırakılamaz!")

    //TODO: E mail formatında yazılsın

    @Email
    private String email;
    @Size(min = 8,message = "Şifre alanı en az 8 karakter verilmelidir.")
    private String password;
    @Min(value=1,message = "address_id "+Messages.Common.IdFieldNeedsToBeMinOne)
    private int addressId;
    private Date birthday;
}
