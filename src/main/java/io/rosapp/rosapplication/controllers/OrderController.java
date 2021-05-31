package io.rosapp.rosapplication.controllers;

import io.rosapp.rosapplication.entities.Sale;
import io.rosapp.rosapplication.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class OrderController {

    private  final OrderService orderService;

        @PostMapping(path = "/order")
        public Sale postOrder(@RequestBody Sale order){
            return orderService.add(order);
        }

        @GetMapping(path="/order/{id}")
        public Sale getOrder(@PathVariable long id){
            return orderService.get(id);
        }

        @GetMapping(path="/orders")
        public List<Sale> getOrders(){
            List<Sale> orders = new ArrayList<>();
            orderService.getAll().forEach(orders::add);
            return orders;
        }

        @DeleteMapping(path="/order/{id}")
        public Sale deleteOrder(@PathVariable long id) {
            return orderService.remove(id);
        }

        @PutMapping(path="/order/{id}")
        public void UpdateOrder(@RequestBody Sale order, @PathVariable long id){
            orderService.update(order, id);
        }

       @GetMapping(path="/user/{id}/orders")
       public List<Sale> getUserOrders(@PathVariable long id){
        return orderService.getByUserId(id);
    }


}

