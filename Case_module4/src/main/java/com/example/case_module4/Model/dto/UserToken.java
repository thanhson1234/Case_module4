package com.example.case_module4.Model.dto;

import com.example.case_module4.Model.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserToken {
    private String username;
    private String token;
    private Roles roles;
}
