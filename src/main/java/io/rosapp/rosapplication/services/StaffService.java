package io.rosapp.rosapplication.services;

import io.rosapp.rosapplication.entities.Staff;
import io.rosapp.rosapplication.repositories.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StaffService {

    final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public void update(Staff staff, long id) {

        Optional<Staff> staffBox =  staffRepository.findById(id);
        if (staffBox.isPresent()) {
            Staff staff1 = staffBox.get();
            staff1.setName(staff.getName());
            staff1.setPassword(staff.getPassword());
            staff1.setType(staff.getType());
            staff1.setEmail(staff.getEmail());
            staffRepository.save(staff1);
        }
    }

    public Staff add(Staff staff) {
        staffRepository.save(staff);
        return staff;
    }

    public Staff get(long id) {
        return staffRepository.findById(id).get();
    }

    public Iterable<Staff> getAll() {
        return staffRepository.findAll();
    }

    public Staff remove(long id){
        Staff staff = staffRepository.findById(id).get();
        staffRepository.deleteById(staff.getId());
        return staff;
    }
}
