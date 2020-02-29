package com.cimspace.studentinfosystem.repository;

import com.cimspace.studentinfosystem.model.Course;
import com.cimspace.studentinfosystem.model.Department;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,Long> {

    Course findFirstByCourseCode(String courseCode);

    List<Course> findByDepartment(Department department);

}
