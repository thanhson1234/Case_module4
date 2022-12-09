package com.example.case_module4.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Diary {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id_Diary;

    private Date DateOfDiary;
    private String content;
    @ManyToOne
    private Account account;

}
