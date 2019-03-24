package com.ttn.sling.project.core.service;


import java.util.List;

public interface StudentClassService {

    String addStudent(Student student);

    String deleteStudent(int studentId);

    boolean isStudentPassed(int id);

    Student getStudent(int StudentId);

    List<Student> getAllStudents();
}