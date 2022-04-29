package org.example;

import javafx.event.ActionEvent;

import java.util.ArrayList;

public class Student {

    String name;
    String school;
    String tutor;
    int age;
    int sessions;
    ArrayList<CriterionScore> grades = new ArrayList<>();

    public int getAveragePerformanceGrade() {
        return averagePerformanceGrade; //this for each criterion
    }

    int averagePerformanceGrade; //this for each criterion

    public Student(String name, String school, String tutor, int age, int sessions) {
        this.name = name;
        this.school = school;
        this.tutor = tutor;
        this.age = age;
        this.sessions = sessions;
    }

    public void addGrades(CriterionScore cs) {
        this.grades.add(cs);
        //dothe math to get the average...
        int per = 0; //this for each criterion
        int counter=0;
        for (CriterionScore i: grades) {
            per= i.getPerformance(); //this for ewach criterion
            counter++;
        }
        averagePerformanceGrade = per/counter; //this for each criterion
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSessions() {
        return sessions;
    }

    public void setSessions(int sessions) {
        this.sessions = sessions;
    }

}

