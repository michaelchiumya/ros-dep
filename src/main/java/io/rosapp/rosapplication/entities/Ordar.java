package io.rosapp.rosapplication.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ordar")//changing class name to 'order' conflicts with jpa/sql key order word
public class Ordar {

    @Id @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String status;
    private Date taken;
    private Date served;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    Staff staff;

    @OneToMany
    private List<Seat> seat = new ArrayList<>();


}
