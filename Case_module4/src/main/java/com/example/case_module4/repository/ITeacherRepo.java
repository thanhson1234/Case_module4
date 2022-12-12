package com.example.case_module4.repository;

import com.example.case_module4.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;

public interface ITeacherRepo extends PagingAndSortingRepository <Account,Long> {
@Query(nativeQuery = true,value = "select *from account join roles on account.role_id = roles.id_role where account.role_id = 2")
    public List<Account> getAllTeacher();
}
