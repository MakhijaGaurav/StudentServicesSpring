package com.fintechx.dao;

import com.fintechx.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("DummyDa ta")
public class StudentDao implements StudentDataAccessInterface {
    private static Map<Integer, Student> students;
    static{
        students = new HashMap<Integer, Student>(){
            {
                put(1,new Student(1,"Gaurav Makhija","gaurav@gmail.com","1234567890","AI"));
                put(2,new Student(2,"Prerna Nandwani","prerna@gmail.com","0987654321","FINANCE"));
                put(3,new Student(3,"Sumit Rohra","sumit@gmail.com","0987612345","ML"));
                put(4,new Student(4,"Mohit Bahrani","mohit@gmail.com","1234509876","OS"));
            }
        };
    }
    @Override
    public Collection<Student>getAllStudents(){
        return this.students.values();
    }

    @Override
    public Student getStudentByID(int ID){
        return this.students.get(ID);
    }

    @Override
    public void deleteStudentByID(int ID){
        this.students.remove(ID);
    }

    @Override
    public void updateStudent(Student student){
        Student updateStudent = students.get(student.getId());
        updateStudent.setCourse(student.getCourse());
        updateStudent.setName(student.getName());
        updateStudent.setEmail(student.getEmail());
        updateStudent.setPhone(student.getPhone());
        this.students.put(student.getId(),student);
    }

    @Override
    public void addStudent(Student student){
        this.students.put(student.getId(),student);
    }
}
