package com.maite.java_api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maite.java_api.model.UserModel;
import com.maite.java_api.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserModel save(UserModel userModel){
        return this.userRepository.save(userModel);
    }

    public void save(String id, String name, String email, short age, String proficience, String password) {
        this.userRepository.save(new UserModel(id, name, email, age, proficience, password));
    }
    
    public List<UserModel> findAll() {
        return (List<UserModel>) this.userRepository.findAll();
    }

    public List<UserModel> findByEmail(String email) {
        return (List<UserModel>) this.userRepository.findByEmail(email);
    }
}
