package com.example.case_module4.Repository;

import com.example.case_module4.Model.Account;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IAccountRepo extends PagingAndSortingRepository<Account,Long> {

    @Query (nativeQuery = true , value = "SELECT * FROM account where e_mail = :toan")
    Account findByEMailName(@Param("toan") String eMail);


    }

