package io.rosapp.rosapplication.repositories;

import io.rosapp.rosapplication.entities.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Long> {
}
