package com.priyanshu.springboot.moxo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document("User")
@AllArgsConstructor
public class User {

    @Id
    private String id;
    private String name;
}
