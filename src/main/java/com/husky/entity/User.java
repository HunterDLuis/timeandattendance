package com.husky.entity;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user")
    private Long id;
    private String name;
    private String lastname;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private boolean isparent;


    public User() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isIsparent() {
        return isparent;
    }

    public void setIsparent(boolean isparent) {
        this.isparent = isparent;
    }
}