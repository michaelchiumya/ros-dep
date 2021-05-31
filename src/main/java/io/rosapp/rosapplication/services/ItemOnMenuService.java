package io.rosapp.rosapplication.services;

import io.rosapp.rosapplication.entities.Item;
import io.rosapp.rosapplication.entities.ItemOnMenu;
import io.rosapp.rosapplication.repositories.ItemOnMenuRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemOnMenuService {

    final ItemOnMenuRepository itemOnMenuRepository;

    public ItemOnMenuService(ItemOnMenuRepository itemOnMenuRepository) {
        this.itemOnMenuRepository = itemOnMenuRepository;
    }

    public void update(ItemOnMenu item, long id) {

        Optional<ItemOnMenu> itemBox =  itemOnMenuRepository.findById(id);
        if (itemBox.isPresent()) {
            ItemOnMenu item1 = itemBox.get();
            item1.setName(item.getName());
            item1.setActive(item.isActive());
            item1.setType(item.getType());
            item1.setSpecial_of_the_day(item.isSpecial_of_the_day());
            item1.setDescription(item.getDescription());
            item1.setPrice(item.getPrice());
            //item1.setMenu(item.getMenu());
            itemOnMenuRepository.save(item1);
        }
    }

    public ItemOnMenu add(ItemOnMenu item) {
        itemOnMenuRepository.save(item);
        return item;
    }

    public ItemOnMenu get(long id) {
        return itemOnMenuRepository.findById(id).get();
    }

    public List<ItemOnMenu> getAll() {
        return (List<ItemOnMenu>) itemOnMenuRepository.findAll();
    }

    public ItemOnMenu remove(long id){
        ItemOnMenu item = itemOnMenuRepository.findById(id).get();
       itemOnMenuRepository.deleteById(item.getId());
       return item;
    }

    public List<ItemOnMenu> getItemsByMenuId(long id) {
        return (List<ItemOnMenu>) itemOnMenuRepository.findByMenuId(id);
    }
}
