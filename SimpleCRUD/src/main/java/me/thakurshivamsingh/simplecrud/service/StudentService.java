package me.thakurshivamsingh.simplecrud.service;

import me.thakurshivamsingh.simplecrud.entity.Student;
import me.thakurshivamsingh.simplecrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student updateStudent(Long id, Student studentReq) {
        Optional<Student> existingStudent = studentRepository.findById(id);

        if(existingStudent.isEmpty()) {
            return null;
        }

        Student studentToSave = existingStudent.get();

        studentToSave.setName(studentReq.getName());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setAge(studentReq.getAge());

        return studentRepository.save(studentToSave);
    }

    public boolean deleteStudent(Long id){
        boolean isExist =  studentRepository.existsById(id);
        if(isExist){
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
