package com.maite.java_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.maite.java_api.model.UserModel;
import java.util.List;


public interface UserRepository extends MongoRepository<UserModel, String>{
    @Query("{'email': ?0}")
    List<UserModel> findByEmail(String name);

}
