package com.priyanshu.springboot.moxo.api;

import com.priyanshu.springboot.moxo.model.User;
import com.priyanshu.springboot.moxo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("api/v1/moxo/user")
@RestController
public class UserController {
    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Optional<User> getUserById(String Id) {
        return userService.getUserById(Id);
    }
}
