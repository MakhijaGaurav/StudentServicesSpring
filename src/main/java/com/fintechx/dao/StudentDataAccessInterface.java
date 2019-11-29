package com.fintechx.dao;

import com.fintechx.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Collection;

public interface StudentDataAccessInterface {
    Collection<Student> getAllStudents();

    Student getStudentByID(int ID);

    void deleteStudentByID(int ID);

    void updateStudent(Student student);

    void addStudent(Student student);
}
