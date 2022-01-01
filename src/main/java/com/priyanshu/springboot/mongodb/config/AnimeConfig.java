package com.priyanshu.springboot.mongodb.config;

import com.priyanshu.springboot.mongodb.repository.AnimeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class AnimeConfig {

    @Bean
    CommandLineRunner animeRunner(AnimeRepository repository, MongoTemplate mongoTemplate) {
        return args -> {
//            Anime anime = new Anime("One Piece");
//
//            Query query = new Query();
//            query.addCriteria(Criteria.where("name").is(anime.getName()));
//
//            List<Anime> animes = mongoTemplate.find(query, Anime.class);
//            if(animes.size() > 1){
//                throw new IllegalStateException(anime.getName() + "Already Taken");
//            }
//            if(animes.isEmpty()){
//                repository.save(anime);
//            }
            System.out.println("Runner");
        };
    }
}
