package com.student.student.service;

import com.student.student.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
@Service
public interface StudentService {
    ResponseEntity<?> createStudent(Student student, BindingResult result);
    ResponseEntity<?> updateMarks(Long id, Student student, BindingResult result);
}
