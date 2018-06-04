package com.husky.controller;

import com.husky.entity.Request;
import com.husky.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by Luis on 04/06/2018.
 */
@RestController
@RequestMapping("/requests")
public class RequestController {
    @Autowired
    private RequestService requestService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Request> getAllRequestUser(){
        return requestService.getAllRequest();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewRequest(@RequestBody RequestUserDTO requestDTO){
        requestService.addNewRequestUser(requestDTO);
    }

    public static class RequestUserDTO{
        private Long userId;
        private Long floatingHolidayId;
        private Date date;
        private String requestStatus;

        public void setUserId(Long userId) {
            this.userId = userId;
        }

        public void setFloatingHolidayId(Long floatingHolidayId) {
            this.floatingHolidayId = floatingHolidayId;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setRequestStatus(String requestStatus) {
            this.requestStatus = requestStatus;
        }

        public Long getUserId() {
            return userId;
        }

        public Long getFloatingHolidayId() {
            return floatingHolidayId;
        }

        public Date getDate() {
            return date;
        }

        public String getRequestStatus() {
            return requestStatus;
        }
    }
}
