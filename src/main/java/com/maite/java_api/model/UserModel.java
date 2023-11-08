package com.maite.java_api.model;

import org.apache.catalina.User;
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
    private String email;
    private short age;
    private String proficience;
    private String password;

    public UserModel(String name, String email, short age, String proficience, String password)
    {
        this.name = name;
        this.email = email;
        this.age = age;
        this.proficience = proficience;
        this.password = password;
    }

    public UserModel() 
    {
        
    }

}
