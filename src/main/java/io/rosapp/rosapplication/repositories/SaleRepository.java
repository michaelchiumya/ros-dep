package io.rosapp.rosapplication.repositories;

import io.rosapp.rosapplication.entities.Sales;
import org.springframework.data.repository.CrudRepository;

public interface SaleRepository extends CrudRepository<Sales, Long> {
}
