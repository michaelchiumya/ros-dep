package io.rosapp.rosapplication.repositories;

import io.rosapp.rosapplication.entities.Ordar;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Ordar, Long > {
}
