package com.bookclub.service.dao;

import java.util.List;

import com.bookclub.Model.Book;
import com.bookclub.service.GenericDao;

public interface GenericCrudDao<E, K> {
    void add(E entity);
    void update(E entity); 
    boolean remove(K key);
    List<E> list(K key); //Return a list of keys 
    E find(K key);  //Return an object of type key
    
} 

public int getId{
    return Id;
  }

  @Override
  public String toString() {
      System.out.println("WishlistItem{id=%s,isbn=%s,title=%s}");
        
  }



