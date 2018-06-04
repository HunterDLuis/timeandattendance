package com.husky.service;

import com.husky.controller.RequestController;
import com.husky.entity.FloatingHoliday;
import com.husky.entity.Request;
import com.husky.entity.User;
import com.husky.repository.FloatingHolidayRepository;
import com.husky.repository.RequestRepository;
import com.husky.repository.UserRepository;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Luis on 04/06/2018.
 */
@Service
public class RequestService {
    @Autowired
    private RequestRepository requestRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FloatingHolidayRepository floatingHolidayRepository;

    public List<Request> getAllRequest(){
        return requestRepository.findAll();
    }

    public void addNewRequestUser(RequestController.RequestUserDTO requestDTO){
        //User user = userRepository.findOne(requestDTO.getUserId());
        //FloatingHoliday floatingHoliday = floatingHolidayRepository.findOne(requestDTO.getFloatingHolidayId());

        Request newRequest = new Request();
        //newRequest.setUser(user);
        //newRequest.setFloatingHoliday(floatingHoliday);
        newRequest.setDate(requestDTO.getDate());
        newRequest.setRequestStatus(requestDTO.getRequestStatus());
        requestRepository.save(newRequest);
    }
}
