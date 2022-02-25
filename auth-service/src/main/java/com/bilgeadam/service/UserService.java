package com.bilgeadam.service;

import com.bilgeadam.repository.IUserRepository;
import com.bilgeadam.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepository iUserRepository;
    /*
    * Kullanıcıyı kayıt eder ve kayıt edilen kullanıcının id bilgisi alınarak geri döndürülür
    * @param user
    *@return
    * */

    public User saveReturnUser(User user) {
        iUserRepository.save(user);
        return user;
    }

    public void save(User user) {
        iUserRepository.save(user);
    }

    public void update(User user) {
        iUserRepository.save(user);
    }
    public void delete(User user) {
        iUserRepository.delete(user);
    }

    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    public Optional<User> findByUsernameAndPassword(String username, String password) {
        return iUserRepository.findByUsernameAndPassword(username,password);
    }
    public boolean isUser(String username,String password) {
        Optional<User> user = iUserRepository.findByUsernameAndPassword(username,password);
        if(user.isPresent())
            return true;
        return false;
    }
}
