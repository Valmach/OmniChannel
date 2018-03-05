package com.valentino.Service;

import com.valentino.Entity.Student;
import com.valentino.Dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;



@Service
public class StudentService {


    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return this.getAllStudents();

    }
}

