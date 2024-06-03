package com.bookclub.service.dao;

import com.bookclub.Model.Book;
import com.bookclub.service.GenericDao;
import com.liferay.headless.commerce.delivery.catalog.dto.v1_0.WishListItem;

public interface WishlistDao extends GenericDao<WishListItem, String> {

    WishlistDao.list(String Username);

}
