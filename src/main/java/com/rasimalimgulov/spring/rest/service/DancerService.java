package com.rasimalimgulov.spring.rest.service;
import com.rasimalimgulov.spring.rest.entity.Dancer;
import java.util.List;

public interface DancerService {
    List<Dancer> getAllDancers();
    void addDancer(Dancer dancer);
    Dancer getDancer(int id);
    void deleteDancer(int id);
}
