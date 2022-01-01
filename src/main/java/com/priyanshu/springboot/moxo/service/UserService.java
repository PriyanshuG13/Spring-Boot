package com.priyanshu.springboot.moxo.service;

import com.priyanshu.springboot.moxo.model.User;
import com.priyanshu.springboot.moxo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(String Id) {
        return userRepository.findById(Id).orElse(null);
    }
}
