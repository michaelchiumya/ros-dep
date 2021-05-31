package io.rosapp.rosapplication.controllers;


import io.rosapp.rosapplication.entities.Menu;
import io.rosapp.rosapplication.services.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class MenuController {

    private  final MenuService menuService;

    @PostMapping(path = "/menu")
    public Menu postMenu(@RequestBody Menu menu){
        return menuService.add(menu);
    }

    @GetMapping(path="/menu/{id}")
    public Menu getItem(@PathVariable long id){
        return menuService.get(id);
    }

    @GetMapping(path="/menus")
    public List<Menu> getMenus(){

       List<Menu> menus = menuService.getAll();
        return menus;
    }

    @DeleteMapping(path="/menu/{id}")
    public Menu deleteMenu(@PathVariable long id) {
        return menuService.remove(id);
    }

    @PutMapping(path="/menu/{id}")
    public void updateMenu(@PathVariable long id, @RequestBody Menu menu){
        menuService.update(menu, id);
    }

}
