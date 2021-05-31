package io.rosapp.rosapplication.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Staff {

    @Id @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String type;
    private String password;
    @OneToMany(cascade = CascadeType.ALL , mappedBy = "staff",fetch = FetchType.LAZY)
    List<Sale> sales ;

}
