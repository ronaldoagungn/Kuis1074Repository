/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ronaldo.kuis1074.service;

import com.ronaldo.kuis1074.entity.cv_1074Entity;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ronaldo.kuis1074.repo.cv_1074Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("cv_1046Service")
@Transactional
public class cv_1074Service {

    @Autowired
    private cv_1074Repo repo;

    public cv_1074Entity insert(cv_1074Entity category) {
        return repo.save(category);
    }
    
    public cv_1074Entity update(cv_1074Entity category) {
        return repo.save(category);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public cv_1074Entity getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv_1074Entity> getAll(){
        return repo.findAllCategory();
    }
}
