/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ronaldo.kuis1074.repo;

import com.ronaldo.kuis1074.entity.nilai_1074Entity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface nilai_1074Repo extends CrudRepository<nilai_1074Entity, Long> {

    @Query("select c from buku c")
    public List<nilai_1074Entity> findAllCategory();
}
