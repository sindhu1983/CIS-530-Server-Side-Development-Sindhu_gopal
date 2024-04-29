package com.bookclub.service.dao;

import java.util.List;

import com.bookclub.Model.Book;
import com.bookclub.service.GenericDao;

public interface GenericCrudDao<E, K> {
    void add(E entity);
    void update(E entity); 
    boolean remove(E entity);
    List<E> list();
    E find(K key).  
    
} 

public int getId{
    return Id;
  }

  @Override
  public String toString() {
      System.out.println("WishlistItem{id=%s,isbn=%s,title=%s}");
        
  }



