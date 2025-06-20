package com.codewithhredwan.fullstack_backend.service;

import com.codewithhredwan.fullstack_backend.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    void saveStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudentById(Long id);

}
