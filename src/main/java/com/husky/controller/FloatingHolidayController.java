package com.husky.controller;

import com.husky.entity.FloatingHoliday;
import com.husky.service.FloatingHolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * Created by Luis on 04/06/2018.
 */
@RestController
@RequestMapping("/floatingHolidays")
public class FloatingHolidayController {
    @Autowired
    private FloatingHolidayService floatingHolidayService;

    @RequestMapping(method = RequestMethod.GET)
    public List<FloatingHoliday> getAllFloatingHoliday(){
        return floatingHolidayService.getAllFloatingHolidayUser();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addFloatingHoliday(@RequestBody FloatingHolidayDTO floatingHolidayDTO){
        floatingHolidayService.addFloatingHoliday(floatingHolidayDTO);
    }

    public static class FloatingHolidayDTO{
        private Date date;
        private Time hours;
        private String user_gender;
        private String user_parent;
        private String description;

        public Date getDate() {
            return date;
        }

        public Time getHours() {
            return hours;
        }

        public String getUser_gender() {
            return user_gender;
        }

        public String getUser_parent() {
            return user_parent;
        }

        public String getDescription() {
            return description;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setHours(Time hours) {
            this.hours = hours;
        }

        public void setUser_gender(String user_gender) {
            this.user_gender = user_gender;
        }

        public void setUser_parent(String user_parent) {
            this.user_parent = user_parent;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
