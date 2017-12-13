/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ronaldo.kuis1074.controller;

import com.ronaldo.kuis1074.entity.cv_1074Entity;
import com.ronaldo.kuis1074.service.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/cv_1074")
public class cv_1074Controller {

    @Autowired
    private cv_1074Service cv_1074Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv_1074Entity insert(@RequestBody cv_1074Entity category) {
        return cv_1074Service.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv_1074Entity update(@RequestBody cv_1074Entity category) {
        return cv_1074Service.update(category);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_anggota}")
    public boolean delete(@PathVariable("id_anggota") Long id) {
        return cv_1074Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_anggota}")
    public cv_1074Entity getById(@PathVariable("id_anggota") Long id){
        return cv_1074Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1074Entity> getAll(){
        return cv_1074Service.getAll();
    }
}
