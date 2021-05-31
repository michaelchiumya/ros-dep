package io.rosapp.rosapplication.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "sale")//changing class name to 'order' conflicts with jpa/sql key word 'order'
public class Sale {

    @Id @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String status;
    private Date taken;
    private Date served;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = false)
    Staff staff;

    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false)
    @JsonBackReference
    Seat seat;



}
