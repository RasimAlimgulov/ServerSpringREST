package com.rasimalimgulov.spring.rest.dao;

import com.rasimalimgulov.spring.rest.entity.Dancer;

import java.util.List;

public interface DancerDAO {
    List<Dancer> getAllDancers();
    void addDancer(Dancer dancer);
    Dancer getDancer(int id);
    void deleteDancer(int id);
}
