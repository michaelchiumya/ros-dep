package io.rosapp.rosapplication.services;

import io.rosapp.rosapplication.entities.Sale;
import io.rosapp.rosapplication.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void update(Sale order, long id) {

        Optional<Sale> orderBox =  orderRepository.findById(id);
        if (orderBox.isPresent()) {
            Sale order1 = orderBox.get();
            order1.setStatus(order.getStatus());
            order1.setServed(order.getServed());
            orderRepository.save(order1);
        }
    }

    //method to save order request data to database
    public Sale add(Sale order) {
        //create now time Date object to input for order taken time
        Date now = new Date();
        //set order time taken to now
        order.setTaken(now);
        //save order
        orderRepository.save(order);
        return order;
    }

    public Sale get(long id) {
        return orderRepository.findById(id).get();
    }

    public Iterable<Sale> getAll() {
        return orderRepository.findAll();
    }

    public Sale remove(long id){
        Sale order = orderRepository.findById(id).get();
        orderRepository.deleteById(order.getId());
        return order;
    }

    public List<Sale> getByUserId(long id) {
        return orderRepository.findByStaffId(id);
    }

    public void addItems(Sale order) {
    }
}
