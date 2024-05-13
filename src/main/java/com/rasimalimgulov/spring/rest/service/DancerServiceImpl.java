package com.rasimalimgulov.spring.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rasimalimgulov.spring.rest.dao.DancerDAO;
import com.rasimalimgulov.spring.rest.entity.Dancer;

import java.util.List;
@Service
public class DancerServiceImpl implements DancerService{

    @Autowired
    private DancerDAO dancerDAO;

    @Transactional
    public List<Dancer> getAllDancers() {
        return dancerDAO.getAllDancers();
    }

    @Transactional
    public void addDancer(Dancer dancer) {
        dancerDAO.addDancer(dancer);
    }


    @Transactional
    public Dancer getDancer(int id) {
        return dancerDAO.getDancer(id);
    }

    @Transactional
    public void deleteDancer(int id) {
        dancerDAO.deleteDancer(id);
    }
}
