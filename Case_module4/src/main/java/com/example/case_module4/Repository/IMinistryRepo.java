package com.example.case_module4.Repository;

import com.example.case_module4.Model.ThePoint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMinistryRepo extends PagingAndSortingRepository <ThePoint,Long> {
//    @Query (nativeQuery = true  , value = "select ")
}
