package io.rosapp.rosapplication.controllers;

import io.rosapp.rosapplication.entities.ItemOnOrder;
import io.rosapp.rosapplication.services.ItemOnOrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class ItemOnOrderController {

    private  final ItemOnOrderService itemOnOrderService;

    @PostMapping(path = "/order-item")
    public ItemOnOrder post(@RequestBody ItemOnOrder item){
        return itemOnOrderService.add(item);
    }

    @GetMapping(path="/order-item/{id}")
    public ItemOnOrder get(@PathVariable long id){
        return itemOnOrderService.get(id);
    }

    @GetMapping(path="/order-items")
    public List<ItemOnOrder> getAll(){
        List<ItemOnOrder> items = itemOnOrderService.getAll();
        return items;
    }

    @DeleteMapping(path="/order-item/{id}")
    public ItemOnOrder delete(@PathVariable long id) {
        return itemOnOrderService.remove(id);
    }

    @PutMapping(path="/order-item/{id}")
    public void Update(@RequestBody ItemOnOrder item, @PathVariable long id){
        itemOnOrderService.update(item, id);
    }


}
