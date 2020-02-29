package com.cimspace.studentinfosystem.repository;

import com.cimspace.studentinfosystem.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Long> {
    Student findFirstByStudentId(String studentId);

//    @Query("select a from Student a where a.departmentId = :departmentId")
//    List<Student> findStudentsByDepartment(@Param("departmentId") String departmentId);

    List<Student> findByFirstname(String name);
}