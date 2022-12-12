package com.example.case_module4.service.Student;

import com.example.case_module4.model.Account;

import java.util.List;

public interface IStudentService {
    public List<Account> getAllStudentByRole();
    public List<Account>  getAllStudentByClass(String nameClass);
    public void saveStudent(Account account);

}
