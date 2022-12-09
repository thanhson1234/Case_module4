package com.example.case_module4.controller;


import com.example.case_module4.model.Account;
import com.example.case_module4.model.Class;
import com.example.case_module4.service.ClassService;
import com.example.case_module4.service.StudenService;
import com.example.case_module4.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/demo")
public class StudentController {
    @Autowired
    ClassService classService;
    @Autowired
    StudenService studenService;
    @Autowired
    TeacherService teacherService;

    @GetMapping("/class")
    public ResponseEntity<List<Class>> getAllClass() {
        return new ResponseEntity<>(classService.getAllClass(), HttpStatus.OK);
    }

    @GetMapping("/student")
    public ResponseEntity<List<Account>> getAllStudent() {
        return new ResponseEntity<>(studenService.getAllStudentByRole(), HttpStatus.OK);
    }

    @GetMapping("/teacher")
    public ResponseEntity<List<Account>> getAllTeacher() {
        return new ResponseEntity<>(teacherService.getAllTeacher(), HttpStatus.OK);
    }
}
