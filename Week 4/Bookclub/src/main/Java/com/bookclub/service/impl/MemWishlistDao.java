package com.bookclub.service.impl;

import java.util.List;

import com.bookclub.Model.Book;

public class MemWishlistDao {
    List<WishlistItem>;

    @Override 
    public List<WishlistItem>() {

        return this.WishlistItem;
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
