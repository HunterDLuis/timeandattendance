package com.husky.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Luis on 03/06/2018.
 */
@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @ManyToOne
    private User userId;
    @ManyToOne
    private FloatingHoliday floatingHolidayId;
    private Date date;
    private String requestStatus;

    public Request() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUser(User userId) {
        this.userId = userId;
    }

    public FloatingHoliday getFloatingHolidayId() {
        return floatingHolidayId;
    }

    public void setFloatingHoliday(FloatingHoliday floatingHolidayId) {
        this.floatingHolidayId = floatingHolidayId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
}
