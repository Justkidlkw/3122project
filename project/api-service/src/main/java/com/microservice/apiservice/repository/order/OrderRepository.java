package com.microservice.apiservice.repository.order;

import com.microservice.apiservice.entity.order.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {
    Orders findByOrderId(Long orderId);
}
