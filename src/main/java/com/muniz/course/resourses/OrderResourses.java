package com.muniz.course.resourses;

import com.muniz.course.entities.Order;
import com.muniz.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResourses {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<Object> findAll() {
        List<Order> orders = orderService.findAll();

        return ResponseEntity.ok().body(orders);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = orderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
