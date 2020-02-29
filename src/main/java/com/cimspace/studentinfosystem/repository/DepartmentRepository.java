package com.cimspace.studentinfosystem.repository;

import com.cimspace.studentinfosystem.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Long> {

    Department findFirstByDepartmentId(String departmentId);
}
