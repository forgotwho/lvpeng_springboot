package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.ShopCategory;

public interface ShopCategoryRepository extends MongoRepository<ShopCategory, String> {

}