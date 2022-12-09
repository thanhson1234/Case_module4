package com.example.case_module4.controller;

import com.example.case_module4.model.Account;
import com.example.case_module4.service.ClassService;
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
@RequestMapping("/student")
public class StudentController {
    @Autowired
    ClassService classService;
    @GetMapping
    public ResponseEntity<List<Account>> finAllClass(){
        return new ResponseEntity<>(classService.getAllClass(), HttpStatus.OK);
    }
}
