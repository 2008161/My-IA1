package org.example;

import javafx.event.ActionEvent;

import java.util.ArrayList;

public class Tutor {

    String name;
    String school;
    String student;
    int grade;
    int age;
    int sessions;
    ArrayList<CriterionScore> grades = new ArrayList<>();
    ArrayList<Student> characteristics = new ArrayList<>();

    public Tutor(String name, String school, String student, int grade, int age, int sessions) {
        this.name = name;
        this.school = school;
        this.student = student;
        this.grade = grade;
        this.age = age;
        this.sessions = sessions;
    }

    public void addGrades(CriterionScore cs) {
        this.grades.add(cs);
        //do the math to get the average...
        int per = 0; //this for each criterion
        int counter = 0;
        for (CriterionScore i : grades) {
            per = i.getPerformance(); //this for each criterion
            counter++;
        }
        averagePerformanceGrade = per / counter; //this for each criterion
        averageDisciplineGrade = per / counter;
        averageEngagementGrade = per / counter;
    }

    public int getAveragePerformanceGrade() {
        return averagePerformanceGrade; //this for each criterion
    }

    public int getAverageDisciplineGrade() {
        return averageDisciplineGrade; //this for each criterion
    }

    public int getAverageEngagementGrade() {
        return averageEngagementGrade; //this for each criterion
    }

    //public int getAverageAttendanceGrade()
    // return averageAttendanceGrade(); //this for each criterion

    int averagePerformanceGrade; //this for each criterion
    int averageDisciplineGrade; //this for each criterion
    int averageEngagementGrade; //this for each criterion
    int averageAttendanceGrade; //this for each criterion

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

    public String getStudent() {
        return student;
    }

    public void setStudent(String tutor) {
        this.student = tutor;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
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


