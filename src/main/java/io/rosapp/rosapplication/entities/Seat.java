package io.rosapp.rosapplication.entities;

import lombok.*;
import org.springframework.core.annotation.Order;

import javax.persistence.*;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Seat {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String status;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Ordar ordar;

}
