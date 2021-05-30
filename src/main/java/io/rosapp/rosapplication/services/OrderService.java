package io.rosapp.rosapplication.services;

import io.rosapp.rosapplication.entities.Ordar;
import io.rosapp.rosapplication.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void update(Ordar ordar, long id) {

        Optional<Ordar> orderBox =  orderRepository.findById(id);
        if (orderBox.isPresent()) {
            Ordar ordar1 = orderBox.get();
            ordar1.setStatus(ordar.getStatus());
            ordar1.setServed(ordar.getServed());
            orderRepository.save(ordar1);
        }
    }

    public Ordar add(Ordar ordar) {
        orderRepository.save(ordar);
        return ordar;
    }

    public Ordar get(long id) {
        return orderRepository.findById(id).get();
    }

    public Iterable<Ordar> getAll() {
        return orderRepository.findAll();
    }

    public Ordar remove(long id){
        Ordar ordar = orderRepository.findById(id).get();
        orderRepository.deleteById(ordar.getId());
        return ordar;
    }
}
