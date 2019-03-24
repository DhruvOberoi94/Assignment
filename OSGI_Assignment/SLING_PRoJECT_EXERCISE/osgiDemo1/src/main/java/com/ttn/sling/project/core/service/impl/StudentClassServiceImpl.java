package com.ttn.sling.project.core.service.impl;


import com.ttn.sling.project.core.service.*;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Component(immediate = true,service = StudentClassService.class)
@Designate(ocd= StudentConfigurations.class)
public class StudentClassServiceImpl implements StudentClassService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    ClassConfigurationServiceImpl classConfigurationServiceImpl =new ClassConfigurationServiceImpl();
    List<Student> studentList = new ArrayList<>();


    @Override
    public String addStudent(Student student) {
        if (classConfigurationServiceImpl.isClassLimitReached(studentList)) {
            studentList.add(student);
            return ("\n\n\n\n\nStudent Added :: "+student+"\n\n\n\n\n\n");

        } else {
            return ("\n\n\n\n\nCan't add student; Class limit reached\n\n\n\n\n\n");
        }
    }

    @Override
    public String deleteStudent(int studentId) {

        if (studentList.size()>0) {
            studentList.remove(studentList.size() - 1);
            return "Student succesfully deleted";
        }
        else
        {
                return "Nothing can be deleted as there are no students";
        }
    }





    @Override
    public boolean isStudentPassed(int id) {
        for(Student student:studentList) {
            if(student.getId()==id) {
               if(student.getMarks()>= classConfigurationServiceImpl.PASS_MARKS){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Student getStudent(int id) {
        Iterator iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student studentTemp = (Student) iterator.next();
            if (studentTemp.getId() == id) {
                return studentTemp;
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
    public void activate(ClassConfigurations classConfigurations) {
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
                "\nIs Student 3 Pass:" +isStudentPassed(3)+
                "\nGetting Student 1: " + getStudent(2)+
                "\nGetting All Students: " +getAllStudents()+
                "\n");
    }
}
