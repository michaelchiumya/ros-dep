package io.rosapp.rosapplication.services;

import io.rosapp.rosapplication.entities.ItemOnMenu;
import io.rosapp.rosapplication.entities.ItemOnOrder;
import io.rosapp.rosapplication.repositories.ItemOnMenuRepository;
import io.rosapp.rosapplication.repositories.ItemOnOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemOnOrderService {

    final ItemOnOrderRepository itemOnOrderRepository;

    public ItemOnOrderService(ItemOnOrderRepository itemOnOrderRepository) {
        this.itemOnOrderRepository = itemOnOrderRepository;
    }

    public void update(ItemOnOrder item, long id) {

        Optional<ItemOnOrder> itemBox =  itemOnOrderRepository.findById(id);
        if (itemBox.isPresent()) {
            ItemOnOrder item1 = itemBox.get();
            item1.setName(item.getName());
            item1.setActive(item.isActive());
            item1.setType(item.getType());
            item1.setSpecial_of_the_day(item.isSpecial_of_the_day());
            item1.setDescription(item.getDescription());
            item1.setPrice(item.getPrice());
            //item1.setMenu(item.getMenu());
            itemOnOrderRepository.save(item1);
        }
    }

    public ItemOnOrder add(ItemOnOrder item) {
        itemOnOrderRepository.save(item);
        return item;
    }

    public ItemOnOrder get(long id) {
        return itemOnOrderRepository.findById(id).get();
    }

    public List<ItemOnOrder> getAll() {
        return (List<ItemOnOrder>) itemOnOrderRepository.findAll();
    }

    public ItemOnOrder remove(long id) {
        ItemOnOrder item = itemOnOrderRepository.findById(id).get();
        itemOnOrderRepository.deleteById(item.getId());
        return item;
    }

}
