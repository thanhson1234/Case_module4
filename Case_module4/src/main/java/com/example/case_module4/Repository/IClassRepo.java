package com.example.case_module4.Repository;


import com.example.case_module4.Model.Account;
import com.example.case_module4.Model.ClassRoom;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IClassRepo extends PagingAndSortingRepository<ClassRoom,Long>  {
    @Query(nativeQuery = true , value = "SELECT * FROM class where id_class = :id")
    ClassRoom findByIdClass(@Param("id") long id);
}
