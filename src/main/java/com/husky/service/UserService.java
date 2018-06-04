package com.husky.service;

import com.husky.controller.UserController;
import com.husky.entity.User;
import com.husky.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Luis on 04/06/2018.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void addUser(UserController.UserRequestDTO newUserDTO){
        User newUser = new User();
        newUser.setName(newUserDTO.getName());
        newUser.setLastname(newUserDTO.getLastname());
        newUser.setGender(newUserDTO.getGender());
        newUser.setParent(newUserDTO.isParent());

        userRepository.save(newUser);
    }
}
