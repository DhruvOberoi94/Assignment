package com.ttn.sling.project.core.service.impl;


import com.ttn.sling.project.core.service.StudentConfiguration;
import com.ttn.sling.project.core.service.StudentService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import java.util.List;

@Component(service = StudentService.class)
@Designate(ocd = StudentConfiguration.class)
public class StudentServiceImp implements StudentService {

    StudentConfiguration config;
    @Activate
    public void activate(StudentConfiguration config) {
        this.config = config;
        System.out.println("\n\n\n\n\nMax Students" + config.maxStudentValue() + " Passing Marks" + config.passingMarks());
    }

    public boolean isClassLimitReached(List list) {
        // TODO Auto-generated method stub
        System.out.println("\n\n\n\nmethod");
        System.out.println(list.size());
        return config.maxStudentValue() <= list.size();
    }

    public float getPassingMarks() {
        // TODO Auto-generated method stub
        return config.passingMarks();
    }

}