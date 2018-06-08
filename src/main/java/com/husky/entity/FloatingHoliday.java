package com.husky.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Luis on 03/06/2018.
 */
@Entity
public class FloatingHoliday {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "floating")
    private Long id;
    private Date date;
    @Column(name = "hour")
    private int  hour;
    @Enumerated(EnumType.STRING)
    private Gender userGender;
    private boolean userParent;
    private String description;

    public FloatingHoliday() {
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getHour() {
        return hour;
    }

    public Gender getUserGender() {
        return userGender;
    }

    public boolean isUserParent() {
        return userParent;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setUserGender(Gender userGender) {
        this.userGender = userGender;
    }

    public void setUserParent(boolean userParent) {
        this.userParent = userParent;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
