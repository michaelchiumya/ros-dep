package io.rosapp.rosapplication.services;

import io.rosapp.rosapplication.entities.Item;
import io.rosapp.rosapplication.entities.Menu;
import io.rosapp.rosapplication.repositories.MenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public void update(Menu menu, long id) {

        //find and get menu
        Optional<Menu> menuBox =  menuRepository.findById(id);
        //check if menu present
        if (menuBox.isPresent()) {
            //assign menu to var
            Menu menu1 = menuBox.get();
            //update menu object attributes data
            menu1.setName(menu.getName());
            menu1.setActive(menu.isActive());
            menu1.setType(menu.getType());
            menu1.setDescription(menu.getDescription());
            //save menu to repository/database
            menuRepository.save(menu1);
        }
    }

    public Menu add(Menu menu) {
        menuRepository.save(menu);
        return menu;
    }

    public Menu get(long id) {
        return menuRepository.findById(id).get();
    }

    public List<Menu> getAll() {
        return (List<Menu>) menuRepository.findAll();
    }

    public Menu remove(long id){
        Menu menu = menuRepository.findById(id).get();
        menuRepository.deleteById(menu.getId());
        return menu;
    }

//    public void addItem(long id, Item item) {
//        //find and get the menu to add items from database
//        Menu menu = menuRepository.findById(id).get();
//       //add item to the menu got from database
//        menu.addItem(item);
//        //save the update
//        menuRepository.save(menu);
//    }
}
