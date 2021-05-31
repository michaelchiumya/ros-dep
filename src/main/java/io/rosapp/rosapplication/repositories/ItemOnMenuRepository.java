package io.rosapp.rosapplication.repositories;

import io.rosapp.rosapplication.entities.ItemOnMenu;
import org.springframework.data.repository.CrudRepository;

public interface ItemOnMenuRepository extends CrudRepository<ItemOnMenu, Long> {

    Iterable<ItemOnMenu> findByMenuId(long id);
}
