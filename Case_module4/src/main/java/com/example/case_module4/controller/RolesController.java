package com.example.case_module4.controller;

import com.example.case_module4.model.Roles;
import com.example.case_module4.service.Roles.RoleService;
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
@RequestMapping("/roles")
public class RolesController {
    @Autowired
    RoleService roleService;

    @GetMapping
    public ResponseEntity <List<Roles>> finAllRoles(){
        return new ResponseEntity<>(roleService.getAllRoles(), HttpStatus.OK);

    }
}
