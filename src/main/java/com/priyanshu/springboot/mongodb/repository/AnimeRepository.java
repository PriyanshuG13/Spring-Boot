package com.priyanshu.springboot.mongodb.repository;

import com.priyanshu.springboot.mongodb.model.Anime;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnimeRepository
        extends MongoRepository<Anime, String> {
}
