package io.rosapp.rosapplication.repositories;

import io.rosapp.rosapplication.entities.Ordar;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Ordar, Long > {

   List<Ordar> findByStaffId(long id);
}
