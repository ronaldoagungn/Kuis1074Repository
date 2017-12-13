/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ronaldo.kuis1074.service;

import com.ronaldo.kuis1074.entity.nilai_1074Entity;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ronaldo.kuis1074.repo.nilai_1074Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("nilai_1046Service")
@Transactional
public class nilai_1074Service {
    @Autowired
    private nilai_1074Repo repo;

    public nilai_1074Entity insert(nilai_1074Entity category) {
        return repo.save(category);
    }
    
    public nilai_1074Entity update(nilai_1074Entity category) {
        return repo.save(category);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public nilai_1074Entity getById(Long id){
        return repo.findOne(id);
    }
    
    public List<nilai_1074Entity> getAll(){
        return repo.findAllCategory();
    }
}
