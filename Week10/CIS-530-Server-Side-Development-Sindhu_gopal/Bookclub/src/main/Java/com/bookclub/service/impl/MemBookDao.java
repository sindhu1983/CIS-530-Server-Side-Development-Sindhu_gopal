package com.bookclub.service.impl;

import com.bookclub.Model.Book;

public class MemBookDao extends GenericDao<Book, String> {
    List<Book>;

    Book Book1 = new Book("Book1","Title 1", "desc1", 190, "Author 1" );
    Book Book2 = new Book("Book2","Title 2", "desc2", 280, "Author 2");
    Book Book3 = new Book("Book3","Title 3", "desc3", 400, "Author 3");
    Book Book4 = new Book("Book4","Title 4", "desc4", 400, "Author 4");
    Book Book5 = new Book("Book5","Title 5", "desc5", 340, "Author 5");


    @Override 
    public List<Book> list() {

        return this.books;
    }

    @Override
    public Book find(String key) {
        for (Book book : this.books) {
            if (book.getIsbn().equals(key)){
                return book;
            }
        }
        return new Book();
    }


}
