package com.bookclub.service.dao;

public interface BookDao extends GenericDao<Book, String>{

    @Override
    public List<Book> list(String key){
        Object doc = getBooksDoc(key);
    }

}
