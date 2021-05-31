package io.rosapp.rosapplication.repositories;

import io.rosapp.rosapplication.entities.Seat;
import io.rosapp.rosapplication.entities.Sale;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository extends CrudRepository<Seat, Long> {
   // Iterable<Sale> findBySaleId(long id) ;

}
