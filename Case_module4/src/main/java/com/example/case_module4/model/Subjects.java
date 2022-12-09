package com.example.case_module4.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
public class Subjects {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id_Subjects;

    private String name_Subjects;
    private Date start_Day_Tuition;
    private Date end_Day_Tuition;
    @ManyToMany
    private List<Account> accounts;
}
