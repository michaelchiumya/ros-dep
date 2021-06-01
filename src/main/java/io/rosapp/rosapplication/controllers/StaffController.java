package io.rosapp.rosapplication.controllers;

import io.rosapp.rosapplication.entities.Login;
import io.rosapp.rosapplication.entities.Staff;
import io.rosapp.rosapplication.services.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class StaffController {

    private  final StaffService staffService;

    @PostMapping(path = "/staff")
    public Staff postUser(@RequestBody Staff user){
            return staffService.add(user);

    }

    @GetMapping(path="/staff/{id}")
    public Staff getUser(@PathVariable long id){
        return staffService.get(id);
    }

    @GetMapping(path="/All-staff")
    public List<Staff> getUsers(){
        List<Staff> users = new ArrayList<>();
        staffService.getAll().forEach(users::add);
        return users;
    }

    @DeleteMapping(path="/staff/{id}")
    public Staff deleteUser(@PathVariable long id) {
        return staffService.remove(id);
    }

    @PutMapping(path="/staff/{id}")
    public void UpdateUser(@RequestBody Staff user, @PathVariable long id){
        staffService.update(user, id);
    }

    //placeholder feature
    @PostMapping(path = "/login")
    public Staff userLogin(@RequestBody Login user){
        return this.staffService.getByAuth(user.getPassword());
    }
}
