package com.globallogic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.modal.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order,Integer>{

}
