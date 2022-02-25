package com.bilgeadam.controller;

import com.bilgeadam.dto.request.RegisterRequestDto;
import com.bilgeadam.repository.entity.User;
import com.bilgeadam.service.UserService;
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

    //ReturnType
    /// -> returnCode -> error -> 9xxx -> 9001 -> username and password error
    // -> success ->1xxx -> 1000, 1100
    // Burada validasyon yapılmalı

    @PostMapping("/doLogin")
    public ResponseEntity<User> doLogin(String username, String password) {
        Optional<User> user = userService.findByUsernameAndPassword(username,password);
        if(user.isPresent())
            return ResponseEntity.ok(user.get());
        return ResponseEntity.ok(new User());

    }

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody @Valid RegisterRequestDto dto) {
        //1.Etapta -> Auth için kayıt olmalı
        userService.saveReturnUser(User.builder()
                        .username(dto.getEmail())
                        .password(dto.getSifre())
                        .build());
        //2.Etapta -> UserService e kayıt için istek atmalı, dönen cevaba göre işlem devam etmeli

        return ResponseEntity.ok().build();
    }

    @GetMapping("findAll")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

}
