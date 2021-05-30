package io.rosapp.rosapplication.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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
    @OneToMany(fetch =  FetchType.EAGER, cascade = {CascadeType.ALL})
    List<Ordar> orders = new ArrayList<>();

}
