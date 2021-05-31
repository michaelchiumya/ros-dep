package io.rosapp.rosapplication.entities;

import lombok.*;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass
public class Item {

    private String name;
    private boolean active;
    private String type;
    private boolean special_of_the_day;
    private double price;
    private String description;
}
