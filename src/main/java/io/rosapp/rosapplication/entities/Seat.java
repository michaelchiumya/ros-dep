package io.rosapp.rosapplication.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


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
    @OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<Sale> sales = new HashSet<>();

}
