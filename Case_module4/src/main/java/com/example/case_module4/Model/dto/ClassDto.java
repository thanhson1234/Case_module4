package com.example.case_module4.Model.dto;

import com.example.case_module4.Model.Account;

import java.util.List;

public class ClassDto {

    private String nameClass;

    private List<Account> accounts;


    public ClassDto() {
    }

    public ClassDto(String nameClass, List<Account> accounts) {
        this.nameClass = nameClass;
        this.accounts = accounts;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
