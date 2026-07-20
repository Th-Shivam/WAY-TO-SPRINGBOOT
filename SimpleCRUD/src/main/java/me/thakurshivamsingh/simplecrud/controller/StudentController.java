package me.thakurshivamsingh.simplecrud.controller;

import me.thakurshivamsingh.simplecrud.entity.Student;
import me.thakurshivamsingh.simplecrud.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService ;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println("Entered StudentService");

        Student studentresp = studentService.createStudent(student);
        System.out.println(student.getName());
        System.out.println(student.getEmail());
        System.out.println("Exiting StudentService");
        return ResponseEntity.status(HttpStatus.CREATED).body(studentresp);
    }


}
