package com.fintechx.service;

import com.fintechx.dao.StudentDao;
import com.fintechx.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public Collection<Student> getAllStudents(){
        return this.studentDao.getAllStudents();
    }

    public Student getStudentByID(int ID){
        return this.studentDao.getStudentByID(ID);
    }
}
