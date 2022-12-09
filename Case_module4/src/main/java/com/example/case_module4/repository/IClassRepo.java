package com.example.case_module4.repository;
import com.example.case_module4.model.Class;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClassRepo extends PagingAndSortingRepository <Class,Long> {

}
