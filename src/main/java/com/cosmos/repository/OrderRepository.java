package com.cosmos.repository;

import com.cosmos.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, Long> {
    List<Order> findOrderByMobileNumber(Long mobileNumber);
}
