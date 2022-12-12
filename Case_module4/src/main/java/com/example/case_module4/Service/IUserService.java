package com.example.case_module4.Service;

import com.example.case_module4.Model.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {
    List<Account> getAll();
    void save(Account account);
    void delete(Long id);
}
