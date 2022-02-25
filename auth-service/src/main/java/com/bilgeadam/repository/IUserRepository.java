package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

    /*
    * Kullanıcının oturum açabilmesi için email ve şifre bilgisi alınır
    * kayıtlı bilgi var ise
    * @param username E-mail Bilgisi
    * @param password Şifre Bİlgisi
    * @return
    *
    * */
    Optional<User> findByUsernameAndPassword(String username,String password);
    /*
    * Durumlarına göre kullanıcıları listeler
    * @param status
    * @return
    * */

    List<User> findByStatus(int status);
}
