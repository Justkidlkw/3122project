package com.microservice.apiservice.controller.order;

import com.microservice.apiservice.entity.order.Orders;
import com.microservice.apiservice.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public Orders createOrder(@RequestBody Orders orders) {
        return orderService.createOrder(orders);
    }

    @GetMapping("/{id}")
    public Orders findByOrderId(@PathVariable("id") Long orderId) {
        return orderService.findByOrderId(orderId);
    }

    @PostMapping("update")
    public Orders updateOrder(@RequestBody Orders orders) {
        return orderService.updateOrder(orders);
    }
}
