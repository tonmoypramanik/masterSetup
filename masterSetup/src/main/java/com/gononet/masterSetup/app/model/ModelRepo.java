/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gononet.masterSetup.app.model;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author juba
 */
public interface ModelRepo<T> {
    public List<T>  findAll();
    public T  findById(UUID id);
    public boolean  save(T model);
    public boolean  update(T model);
    public boolean exist(T model);
}
