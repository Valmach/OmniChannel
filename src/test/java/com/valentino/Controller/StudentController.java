package com.valentino.Controller;

import com.valentino.Entity.Student;
import com.valentino.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/students")
public class StudentController {


     @Autowired
        private StudentService studentService;

     @RequestMapping(method = RequestMethod.GET)
        public Collection<Student> getAllStudents(){
            return this.getAllStudents();

        }

}
