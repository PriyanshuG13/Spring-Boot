package com.priyanshu.springboot.moxo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("User")
@AllArgsConstructor
public class User {
    private String name;
}
