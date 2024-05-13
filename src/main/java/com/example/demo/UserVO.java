package com.example.demo;

import jakarta.validation.constraints.NotEmpty;

import jakarta.validation.constraints.Size;
import lombok.Data;



@Data
public class UserVO {

    @NotEmpty
    private String id;
    private String username;
    @Size(min=1, max=5)
    private String password;
}
