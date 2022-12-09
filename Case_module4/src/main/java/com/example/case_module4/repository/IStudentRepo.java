package com.example.case_module4.repository;

import com.example.case_module4.model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentRepo extends PagingAndSortingRepository <Account,Long>{
 @Query(nativeQuery = true, value = "select * from account join roles on account.role_id = roles.id_role join status_hv on account.status_id = status_hv.id_status where roles.id_role = 3")
 public List<Account> findByNameRole();

}
