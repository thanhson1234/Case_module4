package com.example.case_module4.service.Status;

import com.example.case_module4.model.Status_hv;
import com.example.case_module4.repository.IStatusRepo;
import com.example.case_module4.service.Status.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatusService implements IStatusService {
    @Autowired
    IStatusRepo iStatusRepo;


    @Override
    public List<Status_hv> getAllStatus() {
        return (List<Status_hv>) iStatusRepo.findAll();
    }
}
