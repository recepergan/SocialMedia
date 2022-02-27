package com.bilgeadam.controller;

import com.bilgeadam.dto.request.DoLoginRequestDto;
import com.bilgeadam.dto.request.RegisterRequestDto;
import com.bilgeadam.dto.response.DoLoginResponseDto;
import com.bilgeadam.mapper.UserMapper;
import com.bilgeadam.repository.entity.User;
import com.bilgeadam.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    //ReturnType
    /// -> returnCode -> error -> 9xxx -> 9001 -> username and password error
    // -> success ->1xxx -> 1000, 1100
    // Burada validasyon yapılmalı

    @PostMapping("/doLogin")
    @Operation(summary = "Kullanıcı girişi için kullanılacak metot")
    public ResponseEntity<DoLoginResponseDto> doLogin(@RequestBody @Valid DoLoginRequestDto dto) {
       return ResponseEntity.ok(userService.findByUsernameAndPassword(dto));

    }

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody @Valid RegisterRequestDto dto) {
        //1.Etapta -> Auth için kayıt olmalı
        userService.saveReturnUser(dto);
        //2.Etapta -> UserService e kayıt için istek atmalı, dönen cevaba göre işlem devam etmeli

        return ResponseEntity.ok().build();
    }

    @GetMapping("findAll")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

}
