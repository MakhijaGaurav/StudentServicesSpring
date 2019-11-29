package com.fintechx.controller;

import com.fintechx.entity.Student;
import com.fintechx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
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

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteStudentByID(@PathVariable("id") int ID){
        studentService.deleteStudentByID(ID);
        return "Deleted";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return "UPDATED SUCCESSFULLY!";
    }

    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)//consume specifies accept value type ie JSON
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Added Successfully";
    }
}
