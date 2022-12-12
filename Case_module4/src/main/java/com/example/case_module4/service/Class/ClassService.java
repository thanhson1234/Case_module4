package com.example.case_module4.service.Class;

import com.example.case_module4.repository.IClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.case_module4.model.Class;

import java.util.List;

@Service

public class ClassService implements IClassService {
    @Autowired
    IClassRepo iClassRepo;

    @Override
    public List<Class> getAllClass() {
        return (List<Class>) iClassRepo.findAll();
    }

}
