package com.gmail.artemkrotenok.repository;

import java.util.List;

public interface GenericRepository<I, T> {

    void persist(T entity);

    void merge(T entity);

    void remove(T entity);

    T findById(I id);

    List<T> findAll();

    Long getCount();

    List<T> getItemsByPage(int startPosition, int itemsByPage);

}
