package com.ttn.sling.project.core.service;

import java.util.List;



public class Student {

    private Integer id;
    private Integer age;
    private String name;
    private Float marks;

    public Student()
    {

    }

   public Student(int id, String name, float marks, int age) {
        this.id=id;
        this.name=name;
        this.marks=marks;
        this.age=age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMarks() {
        return marks;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", age=" + age + ", name=" + name + ", marks=" + marks + "]";
    }
}