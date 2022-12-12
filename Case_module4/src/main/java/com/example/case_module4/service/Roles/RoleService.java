package com.example.case_module4.service.Roles;

import com.example.case_module4.model.Account;
import com.example.case_module4.model.Roles;
import com.example.case_module4.repository.IRolesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class RoleService implements IRolesService{
    @Autowired
    IRolesRepo iRolesRepo;
    @Override
    public List<Roles> getAllRoles() {
        return (List<Roles>) iRolesRepo.findAll();
    }
}
