package com.og.todo.domain.repository;


import com.og.todo.domain.model.BaseModel;

/**
 * A sample repository with CRUD operations on a model.
 */
public interface Repository<T extends BaseModel> {

    boolean insert(T model);

    boolean update(T model);

    T get(Object id);

    boolean delete(T model);
}
