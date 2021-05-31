package io.rosapp.rosapplication.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "menu",fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ItemOnMenu> items;

}
