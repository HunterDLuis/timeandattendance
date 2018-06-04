package com.husky.controller;

import com.husky.entity.Gender;
import com.husky.entity.User;
import com.husky.repository.UserRepository;
import com.husky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser (@RequestBody UserRequestDTO user){
        userService.addUser(user);
    }

    public static class UserRequestDTO{
        private String name;
        private String lastname;
        @Enumerated(EnumType.STRING)
        private Gender gender;
        private boolean isParent;

        public void setName(String name) {
            this.name = name;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public void setParent(boolean parent) {
            isParent = parent;
        }

        public String getName() {
            return name;
        }

        public String getLastname() {
            return lastname;
        }

        public Gender getGender() {
            return gender;
        }

        public boolean isParent() {
            return isParent;
        }
    }
}