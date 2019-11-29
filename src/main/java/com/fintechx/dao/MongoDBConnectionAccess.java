package com.fintechx.dao;

import com.fintechx.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("MongoData")
public class MongoDBConnectionAccess implements StudentDataAccessInterface {
    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1, "Pravin", "pravin@gmail.com", "9561527203", "Civil"));
            }
        };
    }

    @Override
    public Student getStudentByID(int ID) {
        return null;
    }

    @Override
    public void deleteStudentByID(int ID) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void addStudent(Student student) {

    }
}
