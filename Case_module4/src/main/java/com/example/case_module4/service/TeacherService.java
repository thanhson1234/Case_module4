package com.example.case_module4.service;

import com.example.case_module4.model.Account;
import com.example.case_module4.repository.ITeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class TeacherService implements ITeacherServicer{
    @Autowired
    ITeacherRepo teacherRepo;
    @Override
    public List<Account> getAllTeacher() {
        return (List<Account>) teacherRepo.findAll();
    }
}