package io.rosapp.rosapplication.services;

import io.rosapp.rosapplication.entities.Item;
import io.rosapp.rosapplication.repositories.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void update(Item item, long id) {

        Optional<Item> itemBox =  itemRepository.findById(id);
        if (itemBox.isPresent()) {
            Item item1 = itemBox.get();
            item1.setName(item.getName());
            item1.setActive(item.isActive());
            item1.setType(item.getType());
            item1.setSpecial_of_the_day(item.isSpecial_of_the_day());
            item1.setDescription(item.getDescription());
            item1.setPrice(item.getPrice());
            //item1.setMenu(item.getMenu());
            itemRepository.save(item1);
        }
    }

    public Item add(Item item) {
        itemRepository.save(item);
        return item;
    }

    public Item get(long id) {
        return itemRepository.findById(id).get();
    }

    public List<Item> getAll() {
        return (List<Item>) itemRepository.findAll();
    }

    public Item remove(long id){
        Item item = itemRepository.findById(id).get();
       itemRepository.deleteById(item.getId());
       return item;
    }

    public List<Item> getItemsByMenuId(long id) {
        return (List<Item>) itemRepository.findByMenuId(id);
    }
}
