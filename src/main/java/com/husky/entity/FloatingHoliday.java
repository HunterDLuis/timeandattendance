package com.husky.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

/**
 * Created by Luis on 03/06/2018.
 */
@Entity
public class FloatingHoliday {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private Date date;
    private Time hours;
    private String user_gender;
    private String user_parent;
    private String description;

    public FloatingHoliday() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHours() {
        return hours;
    }

    public void setHours(Time hours) {
        this.hours = hours;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_parent() {
        return user_parent;
    }

    public void setUser_parent(String user_parent) {
        this.user_parent = user_parent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
