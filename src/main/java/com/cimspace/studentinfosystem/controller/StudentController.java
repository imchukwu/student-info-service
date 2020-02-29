package com.cimspace.studentinfosystem.controller;

import com.cimspace.studentinfosystem.model.Student;
import com.cimspace.studentinfosystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //Get Students
    @RequestMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    //Save Student
    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addStudent(@RequestBody Student student){
//        student.setCourses();
        studentService.addStudent(student);
    }


    //Update Student
    @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    //Search Student
    @RequestMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id){
        return studentService.getStudent(id);
    }

    @RequestMapping("/students/studentId/{studentId}")
    public Student getStudentByStudentId(@PathVariable String studentId){
        return studentService.getStudentByStudentId(studentId);
    }

    @RequestMapping("/students/name/{name}")
    public List<Student> getStudentsByName(@PathVariable String name){
        return studentService.getStudentsByName(name);
    }



    @RequestMapping(method = RequestMethod.DELETE, value="/students/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

}
