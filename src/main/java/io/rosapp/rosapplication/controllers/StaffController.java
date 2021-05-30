package io.rosapp.rosapplication.controllers;

import io.rosapp.rosapplication.entities.Staff;
import io.rosapp.rosapplication.services.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class StaffController {

    private  final StaffService staffService;

    @PostMapping(path = "/user")
    public Staff postUser(@RequestBody Staff user){
        return staffService.add(user);
    }

    @GetMapping(path="/user/{id}")
    public Staff getUser(@PathVariable long id){
        return staffService.get(id);
    }

    @GetMapping(path="/users")
    public List<Staff> getUsers(){
        List<Staff> users = new ArrayList<>();
        staffService.getAll().forEach(users::add);
        return users;
    }

    @DeleteMapping(path="/user/{id}")
    public Staff deleteUser(@PathVariable long id) {
        return staffService.remove(id);
    }

    @PutMapping(path="/user/{id}")
    public void UpdateUser(@RequestBody Staff user, @PathVariable long id){
        staffService.update(user, id);
    }
}
