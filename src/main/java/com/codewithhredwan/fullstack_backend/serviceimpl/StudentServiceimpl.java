package com.codewithhredwan.fullstack_backend.serviceimpl;

import com.codewithhredwan.fullstack_backend.model.Student;
import com.codewithhredwan.fullstack_backend.repository.StudentRepository;
import com.codewithhredwan.fullstack_backend.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceimpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    
    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
