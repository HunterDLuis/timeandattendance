package com.husky.service;

import com.husky.controller.FloatingHolidayController;
import com.husky.entity.FloatingHoliday;
import com.husky.repository.FloatingHolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Luis on 04/06/2018.
 */
@Service
public class FloatingHolidayService {
    @Autowired
    private FloatingHolidayRepository floatingHolidayRepository;

    public List<FloatingHoliday>  getAllFloatingHolidayUser(){
        return floatingHolidayRepository.findAll();
    }

    public void addFloatingHoliday(FloatingHolidayController.FloatingHolidayDTO newFloatingHolidayDTO){
        FloatingHoliday newFloatingHoliday = new FloatingHoliday();
        newFloatingHoliday.setDate(newFloatingHolidayDTO.getDate());
        newFloatingHoliday.setHours(newFloatingHolidayDTO.getHours());
        newFloatingHoliday.setUser_gender(newFloatingHolidayDTO.getUser_gender());
        newFloatingHoliday.setUser_parent(newFloatingHolidayDTO.getUser_parent());
        newFloatingHoliday.setDescription(newFloatingHolidayDTO.getDescription());
        floatingHolidayRepository.save(newFloatingHoliday);
    }
}
