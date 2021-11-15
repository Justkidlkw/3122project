package com.microservice.apiservice.service.order;

import com.microservice.apiservice.entity.Log.LogData;
import com.microservice.apiservice.entity.order.Orders;
import com.microservice.apiservice.repository.order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private RestTemplate restTemplate;

    private String uri = "http://elasticsearch:9200/logs/logs";

    public Orders createOrder(Orders orders) {

        restTemplate.postForEntity(uri, new LogData("menu", "create"), String.class);

        return orderRepository.save(orders);
    }

    public Orders findByOrderId(Long orderId) {

        return orderRepository.findByOrderId(orderId);
    }

    public Orders updateOrder(Orders orders) {

        restTemplate.postForEntity(uri, new LogData("menu", "update"), String.class);

        return orderRepository.save(orders);
    }
}
