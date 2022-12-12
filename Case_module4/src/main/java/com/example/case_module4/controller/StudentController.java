package com.example.case_module4.controller;


import com.example.case_module4.model.Account;
import com.example.case_module4.model.Class;
import com.example.case_module4.model.Status_hv;
import com.example.case_module4.service.Class.ClassService;
import com.example.case_module4.service.Status.StatusService;
import com.example.case_module4.service.Student.StudenService;
import com.example.case_module4.service.Teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
   @Autowired
   StatusService statusService;


    @GetMapping("/class")
    public ResponseEntity<List<Class>> getAllClass() {
        return new ResponseEntity<>(classService.getAllClass(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<Account> saveStudent(@RequestBody Account account){
        studenService.saveStudent(account);
        return new ResponseEntity<>(account,HttpStatus.OK);
    }
    @GetMapping("/status")
    public ResponseEntity<List<Status_hv>>getAllStatus(){
return new ResponseEntity<>(statusService.getAllStatus(),HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity<List<Account>> getAllStudent() {
        return new ResponseEntity<>(studenService.getAllStudentByRole(), HttpStatus.OK);
    }
    @GetMapping("/student/{nameClass}")
    public ResponseEntity<List<Account>> getAllStudentByClass(@PathVariable String nameClass){
        return new ResponseEntity<>(studenService.getAllStudentByClass(nameClass),HttpStatus.OK);
    }

    @GetMapping("/teacher")
    public ResponseEntity<List<Account>> getAllTeacher() {
        return new ResponseEntity<>(teacherService.getAllTeacher(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Account> create(@RequestBody Account account) {
        studenService.saveStudent(account);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

}
