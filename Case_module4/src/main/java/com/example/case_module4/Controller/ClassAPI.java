package com.example.case_module4.Controller;

import com.example.case_module4.Repository.IAccountRepo;
import com.example.case_module4.Service.AccountSecive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class ClassAPI {
    @Autowired
    AccountSecive accountSecive;

    @Autowired
    IAccountRepo iAccountRepo;


}
