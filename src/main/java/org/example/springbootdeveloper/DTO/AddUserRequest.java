package org.example.springbootdeveloper.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class AddUserRequest {
    private String email;
    private String password;
}