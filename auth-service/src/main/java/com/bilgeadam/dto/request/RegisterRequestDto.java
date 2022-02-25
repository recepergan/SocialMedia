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
public class RegisterRequestDto {

    @NotNull
    @Size(min = 2)
    String ad;
    @NotNull
    @Size(min = 2)
    String soyad;
    @Email
    @NotNull
    String email;
    @NotNull
    @Size(min = 8, max = 32)
    String sifre;
    int gun;
    int ay;
    int yıl;
    String ulke;
    String sehir;
    String cinsiyet;
}
