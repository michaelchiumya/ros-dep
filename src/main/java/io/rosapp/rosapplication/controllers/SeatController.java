package io.rosapp.rosapplication.controllers;

import io.rosapp.rosapplication.entities.Seat;
import io.rosapp.rosapplication.services.SeatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class SeatController {

    private  final SeatService seatService;

    @PostMapping(path = "/seat")
    public Seat postSeat(@RequestBody Seat seat){
        return seatService.add(seat);
    }

    @GetMapping(path="/seat/{id}")
    public Seat getSeat(@PathVariable long id){
        return seatService.get(id);
    }

    @GetMapping(path="/seats")
    public List<Seat> getSeats(){
        List<Seat> seats = new ArrayList<>();
        seatService.getAll().forEach(seats::add);
        return seats;
    }

    @DeleteMapping(path="/seat/{id}")
    public Seat deleteSeat(@PathVariable long id) {
        return seatService.remove(id);
    }

    @PutMapping(path="/seat/{id}")
    public void UpdateSeat(@RequestBody Seat seat, @PathVariable long id){
        seatService.update(seat, id);
    }
}
