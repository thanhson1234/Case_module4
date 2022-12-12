package com.example.case_module4.Model.dto;

import com.example.case_module4.Model.Account;
import com.example.case_module4.Model.Subjects;
import com.example.case_module4.Model.ThePoint;
import lombok.Data;

import java.util.List;
@Data
public class ClassDto {

    private String nameClass;

    private List<Account> accounts;

    private List<Subjects> subjects;

    private Double point;

    private String status_hv;
}
