package io.rosapp.rosapplication.repositories;

import io.rosapp.rosapplication.entities.Sale;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Sale, Long > {

   List<Sale> findByStaffId(long id);
}
