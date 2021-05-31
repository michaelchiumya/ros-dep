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
@Table(name = "ordar")//changing class name to 'order' conflicts with jpa/sql key word 'order'
public class Ordar {

    @Id @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String status;
    private Date taken;
    private Date served;
    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = false)
    @JsonBackReference
    Staff staff;


}
