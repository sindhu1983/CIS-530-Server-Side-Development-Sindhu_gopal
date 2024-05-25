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

        @override
        public List<WishlistItem> list(String username) {
            Query query = new Query();
            query.addCriteria(Criteria.where("username").is(username));

            return mongoTemplate.find(query, WishlistItem.class);

            
        }

        @override
        public void update(WishlistItem entity){
            WishlistItem wishlistItem = mongoTemplate.findById(entity.getId,WishlistItem.class);

            if (wishlistItem != null){
                wishlistItem.setIsbn(entity.getISBN());
                wishlistItem.setTitle(entity.getTitle());
                wishlistItem.setUsername(entity.getUsername());

                mongoTemplate.save(wishlistItem);
            }
        }

        @override
        public boolean remove(Stringkey) {
            Query query = new Query();
            query.addCriteria(Criteria.where("id").is(key));
            mongoTemplate.remove(query, WishlistItem.class);
            
            return true;
        }
}

@override

