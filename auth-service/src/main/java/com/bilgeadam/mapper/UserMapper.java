package com.bilgeadam.mapper;

import com.bilgeadam.dto.request.DoLoginRequestDto;
import com.bilgeadam.dto.request.RegisterRequestDto;
import com.bilgeadam.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface UserMapper {

    //Birebir aynı olan alanların eşleşmesi durumu var.
    //Eğer alanların yani değişken adlarının aynı olmadığı durumlarda set işlemi nasıl olacak?
   // @Mapping(source = "email", target = "username")
    @Mapping(source = "email", target = "username")
    @Mapping(source = "sifre", target = "password")
    User toUser(RegisterRequestDto dto);
}


