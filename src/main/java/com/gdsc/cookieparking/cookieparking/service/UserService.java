package com.gdsc.cookieparking.cookieparking.service;

import com.gdsc.cookieparking.cookieparking.domain.Cookie;
import com.gdsc.cookieparking.cookieparking.domain.Directory;
import com.gdsc.cookieparking.cookieparking.domain.User;
import com.gdsc.cookieparking.cookieparking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(String id, String name, String email, String password, String confirmPassword) {
        Optional<User> existed = userRepository.findByEmail(id);
        if(existed.isPresent()) {
            throw new EmailExistedException(email);
        }
        if(password != confirmPassword) {
            throw new DifferentPasswordException();
        }

        User user = User.builder()
                .id(id)
                .name(name)
                .email(email)
                .password(password)
                .confirmPassword(password)
                .parkingScore(0)
                .readCount(0)
                .build();

        return userRepository.save(user);
    }




}
