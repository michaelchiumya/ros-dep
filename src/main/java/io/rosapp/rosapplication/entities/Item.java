package io.rosapp.rosapplication.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.persistence.Table;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "item")
@Entity
public class Item {

    @Id @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private boolean active;
    private String type;
    private boolean special_of_the_day;
    private double price;
    private String description;
    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    @JsonBackReference
    private Menu menu;

}
