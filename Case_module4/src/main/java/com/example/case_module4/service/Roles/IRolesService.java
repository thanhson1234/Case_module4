package com.example.case_module4.service.Roles;

import com.example.case_module4.model.Account;
import com.example.case_module4.model.Roles;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IRolesService {
    public List<Roles> getAllRoles();
}
