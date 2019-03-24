package com.ttn.sling.project.core.service;




public class Student {

     int id;
     int age;
     String name;
     int marks;


    public Student()
    {

    }

   public Student(int id, String name, int marks, int age) {
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

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", age=" + age + ", name=" + name + ", marks=" + marks + "]";
    }
}