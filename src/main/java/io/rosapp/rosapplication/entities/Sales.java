package io.rosapp.rosapplication.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Sales {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date date;
    @OneToOne @JoinColumn(name = "staff_id")
    Staff staff;
    @OneToOne @JoinColumn(name = "order_id")
    Ordar Order;

}
