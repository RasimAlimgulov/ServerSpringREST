package com.rasimalimgulov.spring.rest.controller;

import com.rasimalimgulov.spring.rest.entity.Dancer;
import com.rasimalimgulov.spring.rest.exceptionhandling.DancerIncorrectData;
import com.rasimalimgulov.spring.rest.exceptionhandling.NoSuchEmployeeException;
import com.rasimalimgulov.spring.rest.service.DancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {
    @Autowired
    private DancerService dancerService;


    @GetMapping("/dancers")
    public List<Dancer> showAllDancers(){
        List<Dancer> allDancers=dancerService.getAllDancers();
        return allDancers;
    }
    @GetMapping("/dancers/{id}")
    public Dancer getDancer(@PathVariable int id){
     Dancer dancer=dancerService.getDancer(id);
     if (dancer == null){
         throw new NoSuchEmployeeException("There is no dancer with id = "
             +id+" in database");
     }
    return dancer;
    }

}
