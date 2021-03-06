package com.taylorliss.Dao;

import com.taylorliss.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//This is a class that will get us data from any database
//that we want.

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {

        students = new HashMap<Integer, Student>(){

            {
                put(1, new Student(1, "Said", "Computer Science"));
                put(2, new Student(2, "Alex U", "Finance"));
                put(3, new Student(3, "Anna", "Maths"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }
}
