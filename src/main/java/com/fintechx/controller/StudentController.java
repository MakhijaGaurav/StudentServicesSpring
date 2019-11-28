package com.fintechx.controller;

import com.fintechx.entity.Student;
import com.fintechx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/getStudents")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return this.studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Student getStudentByID(@PathVariable("id") int ID){
        return studentService.getStudentByID(ID);
    }
}
