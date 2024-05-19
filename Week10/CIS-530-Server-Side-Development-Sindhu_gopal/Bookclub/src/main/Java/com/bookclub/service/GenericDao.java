package com.bookclub.service;

public interface GenericDao<E, K> {

    List<E> list(); //return a list of objects of type E
    E find(K key);  // return an objects of type E by Type K values

    
}
