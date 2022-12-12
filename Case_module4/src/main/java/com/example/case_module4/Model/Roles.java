package com.example.case_module4.Model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Roles implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Role;

    private String name;

    @Override
    public String getAuthority() {
        return name;
    }

//    @OneToMany
//    private List<Account> accounts;
}
