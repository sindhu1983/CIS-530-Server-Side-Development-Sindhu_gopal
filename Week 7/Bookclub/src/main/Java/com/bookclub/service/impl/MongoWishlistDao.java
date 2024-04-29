package com.bookclub.service.impl;

import com.bookclub.service.dao.WishlistDao;

public interface  MongoWishlistDao extends WishlistDao {

        @repository ("wishlistDao")
        public class MongoWishlistDao implements wishlistDao {
            @autowired
            private MongoTemplate MongoTemplate;


            @override 
            public list <WishlistItem> list() {
                return mongoTemplate.findAll(WishlistItem.class);

            }

            @override   
            public void add(WishlistItem entity){
                mongoTemplate.save(entity);
            }
        }
}
