package com.example.case_module4.service;

//import com.codegym.vn.model.Classes;
//import com.codegym.vn.model.Student;
import com.example.case_module4.Model.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IStudentService {

    Iterable<Account>findAll();

    Optional<Account> findById(Long id);

    Account save (Account account);

    void delete(Long id);

    Page<Account>findPage(Pageable pageable);

    Iterable<Account>findByName(String name);

}
