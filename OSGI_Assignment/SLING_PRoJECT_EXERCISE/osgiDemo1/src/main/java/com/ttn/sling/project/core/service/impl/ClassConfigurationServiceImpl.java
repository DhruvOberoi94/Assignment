package com.ttn.sling.project.core.service.impl;


import com.ttn.sling.project.core.service.ClassConfigurations;
import com.ttn.sling.project.core.service.ClassConfigurationService;
import com.ttn.sling.project.core.service.Student;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Component(immediate = true, service = ClassConfigurationService.class)
@Designate(ocd = ClassConfigurations.class)
public class ClassConfigurationServiceImpl implements ClassConfigurationService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    int MAX_STUDENT;
    int PASS_MARKS;

    @Override
    public boolean isClassLimitReached(List<Student> list) {
        return MAX_STUDENT <= list.size();
    }

    @Override
    public int getPassingMarks(ClassConfigurations classConfigurations) {
        return PASS_MARKS;
    }

    @Activate
    public void activate(ClassConfigurations config) {
        logger.info("\n\nClass Configuration Service Activated.\n");
        PASS_MARKS=config.passingMarks();
        MAX_STUDENT=config.maxStudentValue();

        List<Student> list=new ArrayList<>();

        list.add(new Student(1,"DHRUV",85,24));
        list.add(new Student(2,"SOUVIK",95,22));
        list.add(new Student(3,"DEEPIKA",35,25));
        list.add(new Student(4,"DIVYA",40,23));


        boolean classLimitReached=isClassLimitReached(list);
        int passingMarks=getPassingMarks(config);

        logger.info("\n\nClass Implementation: isClassLimitReached:: "+classLimitReached+" getPassingMarks:: "+passingMarks+"\n\n");
    }
}