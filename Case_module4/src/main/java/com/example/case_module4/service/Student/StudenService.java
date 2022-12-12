package com.example.case_module4.service.Student;

import com.example.case_module4.model.Account;
import com.example.case_module4.repository.IStudentRepo;
import com.example.case_module4.service.Student.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class StudenService implements IStudentService {
    @Autowired
    IStudentRepo iStudentRepo;

    @Override
    public List<Account> getAllStudentByRole() {
        return iStudentRepo.findByNameRole();
    }

    @Override
    public List<Account> getAllStudentByClass(String nameClass) {
        return iStudentRepo.allStudentByClass(nameClass);
    }

    @Override
    public void saveStudent(Account account) {
        iStudentRepo.save(account);
    }


}
