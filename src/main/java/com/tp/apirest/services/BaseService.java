package com.tp.apirest.services;

import com.tp.apirest.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, Id extends Serializable>{

    public List<E> findAll() throws Exception;
    public E findById(Id id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Id id, E entity) throws Exception;
    public boolean delete(Id id) throws Exception;



}
