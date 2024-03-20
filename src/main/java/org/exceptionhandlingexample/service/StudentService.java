package org.exceptionhandlingexample.service;

import org.exceptionhandlingexample.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public Student save(Student student) {
        students.add(student);
        return student;
    }

    public Student findOne(Long id) throws Exception {
        for (Student student : students) {
            if (student.getId() == id)
                return student;
        }
        throw new Exception("Student not found with id " + id);
    }
}
