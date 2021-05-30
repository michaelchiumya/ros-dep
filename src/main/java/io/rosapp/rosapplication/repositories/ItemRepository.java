package io.rosapp.rosapplication.repositories;

import io.rosapp.rosapplication.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {


}
