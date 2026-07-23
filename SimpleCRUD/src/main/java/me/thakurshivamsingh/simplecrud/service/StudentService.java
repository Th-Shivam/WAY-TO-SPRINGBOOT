package me.thakurshivamsingh.simplecrud.service;

import me.thakurshivamsingh.simplecrud.entity.Student;
import me.thakurshivamsingh.simplecrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    //1 . Buiseness logic
    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student studentreq){

       Student studentresp = studentRepository.save(studentreq);

        return studentresp;

    }

    public Student getStudent(Long id){
        Optional<Student> studentresp = studentRepository.findById(id);
        if(studentresp.isPresent()){
            return studentresp.get();
        }
        return null;
    }

}
