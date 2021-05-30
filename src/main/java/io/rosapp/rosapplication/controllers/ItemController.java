package io.rosapp.rosapplication.controllers;

import io.rosapp.rosapplication.entities.Item;
import io.rosapp.rosapplication.services.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class ItemController {

    private  final ItemService itemService;

    @PostMapping(path = "/item")
    public Item postItem(@RequestBody Item item){
        return itemService.add(item);
    }

    @GetMapping(path="/item/{id}")
    public Item getItem(@PathVariable long id){
        return itemService.get(id);
    }

    @GetMapping(path="/items")
    public List<Item> getItems(){
        List<Item> items = new ArrayList<>();
        itemService.getAll().forEach(items::add);
        return items;
    }

    @DeleteMapping(path="/item/{id}")
    public Item deleteItem(@PathVariable long id) {
         return itemService.remove(id);
    }

    @PutMapping(path="/item/{id}")
    public void UpdateItem(@RequestBody Item item, @PathVariable long id){
     itemService.update(item, id);
    }

}
