package com.example.case_module4.service;

import com.example.case_module4.model.Account;
import com.example.case_module4.repository.IClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ClassService implements IClassService{
    @Autowired
    IClassRepo iClassRepo;
    @Override
    public List<Account> getAllClass() {
        return (List<Account>) iClassRepo.findAll();
    }
}
