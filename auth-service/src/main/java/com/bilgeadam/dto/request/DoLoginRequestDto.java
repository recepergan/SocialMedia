package com.bilgeadam.dto.request;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class DoLoginRequestDto {

    @Email(message = "Lütfen geçerli bir email adresi giriniz")
    @NotNull(message = "Email adresi boş geçilemez")
    String username;
    @NotNull
    @Size(max = 32, min= 8, message = "Email adresi en az 8 karakter ve en fazla 32 karakter olabilir")
    String password;

}
