package com.ttn.sling.project.core.service;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Student service configuration" , description="Service Configuration")
public @interface StudentConfiguration {

    @AttributeDefinition(name = "Max Students", description = "Number of students allowed")
    int maxStudentValue();

    @AttributeDefinition(name = "Passing Marks", description = "Marks required to pass")
    float passingMarks();

}