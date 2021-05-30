package io.rosapp.rosapplication.entities;

import lombok.*;

import javax.persistence.Table;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "menu")
public class Menu {

    @Id @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private boolean active;
    private String type;
    private String description;
    @OneToMany(mappedBy = "menu")
    private List<Item> items;

}
