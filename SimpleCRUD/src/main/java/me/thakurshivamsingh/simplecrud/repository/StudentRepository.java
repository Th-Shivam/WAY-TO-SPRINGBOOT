package me.thakurshivamsingh.simplecrud.repository;

import me.thakurshivamsingh.simplecrud.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent(Student student) {
        System.out.println("Entered StudentRepository.saveStudent");
        //save to db
        Student s1 = new Student();
        s1.setId(student.getId());
        s1.setName(student.getName());
        s1.setEmail(student.getEmail());
        s1.setSubject(student.getSubject());
        s1.setRoll(student.getRoll());
        System.out.println("Exiting StudentRepository.saveStudent");

        return s1;
    }
}
