package io.rosapp.rosapplication.services;

import io.rosapp.rosapplication.entities.Seat;
import io.rosapp.rosapplication.repositories.SeatRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeatService {

    final SeatRepository seatRepository;

    public SeatService(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    public void update(Seat seat, long id) {

        Optional<Seat> seatBox =  seatRepository.findById(id);
        if (seatBox.isPresent()) {
            Seat seat1 = seatBox.get();
            seat1.setStatus(seat.getStatus());
            seat1.setName(seat.getName());
            seatRepository.save(seat1);
        }
    }

    public Seat add(Seat seat) {
        seatRepository.save(seat);
        return seat;
    }

    public Seat get(long id) {
        return seatRepository.findById(id).get();
    }

    public Iterable<Seat> getAll() {
        return seatRepository.findAll();
    }

    public Seat remove(long id){
        Seat seat = seatRepository.findById(id).get();
        seatRepository.deleteById(seat.getId());
        return seat;
    }
}
