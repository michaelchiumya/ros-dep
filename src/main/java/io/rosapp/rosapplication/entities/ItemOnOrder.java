package io.rosapp.rosapplication.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ItemOnOrder extends Item{
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

}
