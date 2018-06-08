package com.husky.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Luis on 03/06/2018.
 */
@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "request")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, unique = true)
    //@JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "floatingHoliday_id", referencedColumnName = "id", nullable = false, unique = true)
    //@JoinColumn(name = "floatingHoliday_id")
    private FloatingHoliday floatingHoliday;

    private Date dateSend;

    private String statusRequest;

    public Request() {
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Date getDateSend() {
        return dateSend;
    }

    public void setDateSend(Date dateSend) {
        this.dateSend = dateSend;
    }

    public String getStatusRequest() {
        return statusRequest;
    }

    public void setStatusRequest(String statusRequest) {
        this.statusRequest = statusRequest;
    }

    public FloatingHoliday getFloatingHoliday() {
        return floatingHoliday;
    }

    public void setFloatingHoliday(FloatingHoliday floatingHoliday) {
        this.floatingHoliday = floatingHoliday;
    }
}
