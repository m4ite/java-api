package com.maite.java_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Document("user") // Nome da tabela no mongo
public class UserModel {
    @Id
    private String id;
    private String name;
    private short age;

    public UserModel(String name, short age)
    {
        this.name = name;
        this.age = age;
    }

}
