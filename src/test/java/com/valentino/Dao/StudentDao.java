package com.valentino.Dao;

import com.valentino.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static StudentDao

    {

        private static Map<Integer, String> student;

        static {

        students = new HashMap<Integer, Student>() {

            {
                put(1, new Student(1, "Said", "Mechanical Engineer "));
                put(2, new Student(2, "Alex U", "Computer Science "));
                put(3, new Student(3, "Anna ", "Maths"));
            }
        };
    }
        public Collection<Student> getAllStudents () {
        return this.students.values();

    }

    }
}



