package com.lvpeng.seller.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lvpeng.seller.mongo.model.MemberPresentDetail;

public interface MemberPresentDetailRepository extends MongoRepository<MemberPresentDetail, String> {

}
