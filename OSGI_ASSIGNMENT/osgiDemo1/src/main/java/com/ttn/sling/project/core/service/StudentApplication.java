package com.ttn.sling.project.core.service;


import java.util.List;

public interface StudentApplication {

    String addStudent(Student student);

    String deleteStudent(int studentId);

    String isStudentPassed(Student student);

    Student getStudent(int StudentId);

    List<Student> getAllStudents();
}