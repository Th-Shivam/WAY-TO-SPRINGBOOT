package me.thakurshivamsingh.simplecrud.controller;

import me.thakurshivamsingh.simplecrud.entity.Student;
import me.thakurshivamsingh.simplecrud.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService ;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student studentresp = studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentresp);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student studentresp = studentService.getStudent(id) ;
        if(studentresp == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentresp);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> studentList = studentService.getAllStudents() ;
        if(studentList == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentList);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id , @RequestBody Student student){
        Student studentresp = studentService.updateStudent(id , student) ;
        if(studentresp == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentresp);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        boolean isDeleted = studentService.deleteStudent(id);
        if(!isDeleted){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body("Student deleted successfully");
    }


}
