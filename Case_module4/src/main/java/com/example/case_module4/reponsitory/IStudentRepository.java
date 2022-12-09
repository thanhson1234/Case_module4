package com.example.case_module4.reponsitory;

import com.example.case_module4.Model.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends PagingAndSortingRepository<Account,Long> {
    Iterable<Account> findAllByFullNameContaining(String name);
}
