package com.husky.controller;

import com.husky.entity.FloatingHoliday;
import com.husky.repository.FloatingHolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 * Created by Luis on 04/06/2018.
 */
@RestController
public class FloatingHolidayController {
    @Inject
    private FloatingHolidayRepository floatingHolidayRepository;

    @RequestMapping(value = "/floatings", method = RequestMethod.POST)
    public FloatingHoliday addFloating(@RequestBody FloatingHoliday newFloating){
        return floatingHolidayRepository.save(newFloating);
    }

    /*@RequestMapping(value = "/users/{id}/floatings", method = RequestMethod.GET)
    public List<FloatingHoliday> getAllFloatingByUser(@PathVariable String gender, @PathVariable boolean isParent){
        return floatingHolidayRepository.findByUserGenderAndUserIsParent(gender, isParent);
    }*/
    @RequestMapping(value = "/users/{id}/floatings", method = RequestMethod.GET)
    public List<FloatingHoliday> getAllFloatingByUser(@PathVariable String gender){
        //return floatingHolidayRepository.findByUserGenderFloatingHoliday(gender);
        return null;
    }
}
