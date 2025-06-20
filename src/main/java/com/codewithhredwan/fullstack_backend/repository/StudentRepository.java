package com.codewithhredwan.fullstack_backend.repository;

import com.codewithhredwan.fullstack_backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}