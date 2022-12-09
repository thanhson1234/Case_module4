package com.example.case_module4.service;


import codegym.model.Student;
import codegym.repository.StudentRepo;
import com.example.case_module4.Model.Account;
import com.example.case_module4.reponsitory.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService implements IStudentService{
    @Autowired
    IStudentRepository iStudentRepository;

    @Override
    public Page<Account> findAll(Pageable pageable) {
        return studentRepo.findAll(pageable);
    }

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void delete(long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public Optional<Student> findById(long id) {
        return studentRepo.findById(id);
    }

}