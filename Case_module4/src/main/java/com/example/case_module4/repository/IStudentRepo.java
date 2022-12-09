package com.example.case_module4.repository;

import com.example.case_module4.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

@Service
public interface IStudentRepo extends PagingAndSortingRepository <Account,Long>{

}
