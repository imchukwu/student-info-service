package com.cimspace.studentinfosystem.service;

import com.cimspace.studentinfosystem.model.Student;
import com.cimspace.studentinfosystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }

    public List<Student> getStudentsByName(String name) {
        return studentRepository.findByFirstname(name);
    }

    public Student getStudentByStudentId(String studentId) {
        return studentRepository.findFirstByStudentId(studentId);
    }

//    public List<Student> getStudentsByDepartment(String departmentId) {
//        return studentRepository.findStudentsByDepartment(departmentId);
//    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
