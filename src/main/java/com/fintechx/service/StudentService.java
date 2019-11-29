package com.fintechx.service;

import com.fintechx.dao.StudentDataAccessInterface;
import com.fintechx.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    @Qualifier("DummyData")
    private StudentDataAccessInterface studentDataAccessInterface;

    public Collection<Student> getAllStudents(){
        return this.studentDataAccessInterface.getAllStudents();
    }

    public Student getStudentByID(int ID){
        return this.studentDataAccessInterface.getStudentByID(ID);
    }

    public  void deleteStudentByID(int ID){
        this.studentDataAccessInterface.deleteStudentByID(ID);
    }

    public void updateStudent(Student student){
        this.studentDataAccessInterface.updateStudent(student);
    }

    public void addStudent(Student student){
        this.studentDataAccessInterface.addStudent(student);
    }
}
