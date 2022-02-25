package com.bilgeadam.repository.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Table(name = "tbluser")
@Entity
public class User {
    @SequenceGenerator(name = "sq_tbluser_id",sequenceName = "sq_tbluser_id",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "sq_tbluser_id")
    // Bu 1. Adet sq oluşturur, bütün tablolarda sayı sürekli artar.
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    long id;
    String username;
    String password;
    /**
     * Status kullanıcının aktiflik durumunu belirtir.
     * 0-> pasif kullanıcı
     * 1-> aktif kullanıcı
     * 2-> engellenmiş kullanıcı  , hesap askıda
     * 3-> V.S.
     */
    int status;
    long createDate;
    long updateDate;

}
