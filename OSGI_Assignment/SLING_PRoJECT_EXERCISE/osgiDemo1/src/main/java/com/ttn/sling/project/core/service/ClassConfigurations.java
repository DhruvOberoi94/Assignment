package com.ttn.sling.project.core.service;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Class configurations" , description="Class Service Configuration")
public @interface ClassConfigurations {

    @AttributeDefinition(name = "Max Students", description = "Number of students allowed", type = AttributeType.INTEGER)
    int maxStudentValue() default 10;

    @AttributeDefinition(name = "Passing Marks", description = "Marks required to pass", type = AttributeType.INTEGER)
    int passingMarks() default 40;

}