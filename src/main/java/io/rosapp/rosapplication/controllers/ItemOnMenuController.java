package io.rosapp.rosapplication.controllers;

import io.rosapp.rosapplication.entities.ItemOnMenu;
import io.rosapp.rosapplication.services.ItemOnMenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class ItemOnMenuController {

    private  final ItemOnMenuService itemOnMenuService;

    @PostMapping(path = "/menu-item")
    public ItemOnMenu post(@RequestBody ItemOnMenu item){
        return itemOnMenuService.add(item);
    }

    @GetMapping(path="/menu-item/{id}")
    public ItemOnMenu get(@PathVariable long id){
        return itemOnMenuService.get(id);
    }

    @GetMapping(path="/menu-items")
    public List<ItemOnMenu> getAll(){
        List<ItemOnMenu> items = itemOnMenuService.getAll();
        return items;
    }

    @DeleteMapping(path="/menu-item/{id}")
    public ItemOnMenu delete(@PathVariable long id) {
         return itemOnMenuService.remove(id);
    }

    @PutMapping(path="/menu-item/{id}")
    public void Update(@RequestBody ItemOnMenu item, @PathVariable long id){
     itemOnMenuService.update(item, id);
    }

    //extra methods to get items in the menu
    @GetMapping(path="/menu/{id}/items")
    public List<ItemOnMenu> getMenuItems(@PathVariable long id){
        List<ItemOnMenu> items = itemOnMenuService.getItemsByMenuId(id);
        return items;
    }

}
