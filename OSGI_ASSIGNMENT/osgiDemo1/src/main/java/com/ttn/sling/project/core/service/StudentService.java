package com.ttn.sling.project.core.service;


import java.util.List;

public interface StudentService {

    boolean isClassLimitReached(List list);
    float getPassingMarks();

}