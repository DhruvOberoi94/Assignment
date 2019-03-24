package com.ttn.sling.project.core.service;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Student Configurations", description = "Student Configuration Service")
public @interface StudentConfigurations {

    @AttributeDefinition
    String configValue() default "default student configurations";



}
