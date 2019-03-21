package com.ttn.sling.project.core.service.impl;


import com.ttn.sling.project.core.service.Student;
import com.ttn.sling.project.core.service.StudentApplication;
import com.ttn.sling.project.core.service.StudentConfiguration;
import com.ttn.sling.project.core.service.StudentService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(service = StudentApplication.class, immediate = true)
public class StudentApplicationImp implements StudentApplication {
    @Reference
    StudentService service;

    ArrayList<Student> studentList = new ArrayList<>();
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String addStudent(Student student) {
        if (service.isClassLimitReached(studentList)) {
            return ("\n\n\n\n\nCan't add student; Class limit reached\n\n\n\n\n\n");
        } else {
            studentList.add(student);
            return ("\n\n\n\n\nStudent Added\n\n\n\n\n\n");
        }
    }

    @Override
    public String deleteStudent(int studentId) {
        Iterator iterator = studentList.iterator();
        boolean flag = false;
        while (iterator.hasNext()) {
            Student studentTemp = (Student) iterator.next();
            if (studentTemp.getId() == studentId) {
                studentList.remove(studentTemp);
                flag = true;


            }
        }
        if (!flag)
            return ("\n\n\n\n\n\n\nCannot delete student\n\n\n\n\n\n\n");
        else
            return ("\n\n\n\n\nStudent deleted\n\n\n\n\n");
    }

    @Override
    public String isStudentPassed(Student student) {
        if (service.getPassingMarks() <= student.getMarks())
            return "\n\n\n\nPassed\n\n\n\n\n";
        else
            return "\n\n\n\n\nFailed\n\n\n\n\n";
    }

  /*  @Override
    public Student getStudent(int StudentId) {
        return null;
    }
*/

   /* @Override
    public int getStudentId(String studentName) {
        Iterator iterator = studentList.iterator();

        int id = 0;
        while (iterator.hasNext()) {
            Student studentTemp = (Student) iterator.next();
            if (studentTemp.getName() == studentName) {
                id = studentTemp.getId();
            }
        }
        return id;

    }*/


    @Override
    public Student getStudent(int id) {

        for(Student student:studentList) {
            if(student.getId()==id) {
                return student;
            }
        }

        return new Student();
    }

    @Override
    public List<Student> getAllStudents() {
        if(studentList.size()>0) {
            return studentList;
        }
        return new ArrayList<>();
    }

    @Activate
    public void activateMethod(StudentConfiguration studentConfiguration) {
        logger.info("\n\nStudent Configuration Service Activated.\n");


        Student student1,student2,student3,student4;
        student1=new Student(1,"DHRUV",95,24);
        student2=new Student(2,"DIVYA",70,22);
        student3=new Student(3,"DEEPIKA",80,25);
        student4=new Student(4,"SOUVIK",72,23);





        logger.info("\n\nStudent Implementation:\n" +
                "Adding Student 1: " +addStudent(student1)+
                "\nAdding Student 2: " +addStudent(student2)+
                "\nAdding Student 3: " +addStudent(student3)+
                "\nAdding Student 4: "+addStudent(student4)+
                "\nDeleting Last Student: " +deleteStudent(2)+
                "\nIs Student 3 Pass:" +isStudentPassed(student4)+
                "\nGetting Student 1: " + getStudent(2)+
                "\nGetting All Students: " +getAllStudents()+
                "\n");
    }


}
