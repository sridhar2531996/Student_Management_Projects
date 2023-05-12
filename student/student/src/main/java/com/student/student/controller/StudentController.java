package com.student.student.controller;

import com.student.student.entity.Student;
import com.student.student.repository.StudentRepository;
import com.student.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/v1")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/students")
    public ResponseEntity<?> createStudent(@RequestBody @Valid Student student, BindingResult result) {
        ResponseEntity<?> response = studentService.createStudent(student,result);
        return response;
    }
    @PutMapping("/students/{id}")
    public ResponseEntity<?> updateStudentMarks(@PathVariable("id") Long id, @RequestBody @Valid Student student, BindingResult result) {
        return studentService.updateMarks(id,student,result);
    }
}
