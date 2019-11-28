package com.fintechx.dao;

import com.fintechx.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
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
    public Collection<Student>getAllStudents(){
        return this.students.values();
    }

    public Student getStudentByID(int ID){
        return this.students.get(ID);
    }
}
