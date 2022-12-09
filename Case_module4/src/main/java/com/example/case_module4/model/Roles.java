package com.example.case_module4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Roles{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Role;

    private String name;

//    @OneToMany
//    private List<Account> accounts;
}
