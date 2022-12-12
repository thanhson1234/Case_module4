package com.example.case_module4.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Status_hv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Status;

    private String name;
}
