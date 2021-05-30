package io.rosapp.rosapplication.controllers;

import io.rosapp.rosapplication.entities.Ordar;
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
        public Ordar postOrder(@RequestBody Ordar ordar){
            return orderService.add(ordar);
        }

        @GetMapping(path="/order/{id}")
        public Ordar getOrder(@PathVariable long id){
            return orderService.get(id);
        }

        @GetMapping(path="/ordars")
        public List<Ordar> getOrders(){
            List<Ordar> ordars = new ArrayList<>();
            orderService.getAll().forEach(ordars::add);
            return ordars;
        }

        @DeleteMapping(path="/order/{id}")
        public Ordar deleteOrder(@PathVariable long id) {
            return orderService.remove(id);
        }

        @PutMapping(path="/order/{id}")
        public void UpdateOrder(@RequestBody Ordar ordar, @PathVariable long id){
            orderService.update(ordar, id);
        }

}

