package com.crm.controller;

import com.crm.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("/findName")
    public void  getName(){
        Long id;
        id=1L;
        String name= cityService.findCity(id);
        System.out.print(name);

    }
}
