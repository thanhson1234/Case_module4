package com.example.case_module4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Class;

    private String name_Class;

    private long id_Teacher;

}
