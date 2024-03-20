package org.exceptionhandlingexample.controller;

import lombok.RequiredArgsConstructor;
import org.exceptionhandlingexample.model.Student;
import org.exceptionhandlingexample.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student) {
        Student save = studentService.save(student);
        return new ResponseEntity<>(save, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findOne(@PathVariable Long id) throws Exception {
        Student one = studentService.findOne(id);
        return new ResponseEntity<>(one, HttpStatus.OK);
    }

}
