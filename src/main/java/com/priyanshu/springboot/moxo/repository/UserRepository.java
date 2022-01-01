package com.priyanshu.springboot.moxo.repository;

import com.priyanshu.springboot.moxo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository
        extends MongoRepository<User, String> {
}
