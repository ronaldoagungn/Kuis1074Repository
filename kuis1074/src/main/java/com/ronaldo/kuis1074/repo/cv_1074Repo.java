/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ronaldo.kuis1074.repo;

import com.ronaldo.kuis1074.entity.cv_1074Entity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface cv_1074Repo extends CrudRepository<cv_1074Entity, Long> {

    @Query("select c from anggota c")
    public List<cv_1074Entity> findAllCategory();
}
