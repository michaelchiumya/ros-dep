package io.rosapp.rosapplication.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Login {

    private String email;
    private String password;
}
