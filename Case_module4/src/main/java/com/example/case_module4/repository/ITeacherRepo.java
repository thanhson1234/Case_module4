package com.example.case_module4.repository;

import com.example.case_module4.model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ITeacherRepo extends PagingAndSortingRepository <Account,Long> {

}
