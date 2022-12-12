package com.example.case_module4.repository;

import com.example.case_module4.model.Status_hv;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IStatusRepo extends PagingAndSortingRepository<Status_hv,Long> {
}
