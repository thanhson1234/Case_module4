package com.example.case_module4.service;

import com.example.case_module4.model.Account;
import com.example.case_module4.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class StudenService implements IStudentService{
    @Autowired
    IStudentRepo iStudentRepo;

    @Override
    public List<Account> getAllStudentByRole() {
        return iStudentRepo.findByNameRole();
    }
}
