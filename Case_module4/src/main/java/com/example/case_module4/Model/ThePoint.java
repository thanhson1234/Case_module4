package com.example.case_module4.Model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class ThePoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Point;

    private double point;

    private Date date_point;

    @ManyToOne
    @JoinColumn(name = "subjects_id")
    private Subjects subjects;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account accounts;


}
