package com.jasonpaul.orderservice.repository;

import com.jasonpaul.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
