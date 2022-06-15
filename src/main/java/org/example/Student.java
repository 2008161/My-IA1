package org.example;

import javafx.event.ActionEvent;

import java.util.ArrayList;

public class Student {

    String name;
    String school;
    String tutor;
    int grade;
    int age;
    int sessions;
    ArrayList<CriterionScore> grades = new ArrayList<>();
    ArrayList<Student> characteristics = new ArrayList<>();
    int averagePerformanceGrade =0; //this for each criterion
    int averageDisciplineGrade=0; //this for each criterion
    int averageEngagementGrade=0; //this for each criterion
    int averageAttendanceGrade=0; //this for each criterion

    public Student(String name, String school, String tutor, int grade, int age, int sessions) {
        this.name = name;
        this.school = school;
        this.tutor = tutor;
        this.grade = grade;
        this.age = age;
        this.sessions = sessions;
    }

    public void addGrades(CriterionScore cs) {
        this.grades.add(cs);
        //do the math to get the average...
        int per = 0; //this for each criterion
        int dis = 0;
        int eng = 0;
        int att = 0;
        int counter = 0;
        for (CriterionScore i : grades) {
            per = i.getPerformance(); //this for each criterion
            counter++;
        }
        averagePerformanceGrade = per / counter; //this for each criterion
        averageDisciplineGrade = dis / counter;
        averageEngagementGrade = eng / counter;
        averageAttendanceGrade = att / counter;
    }

    public int getAveragePerformanceGrade() {
        return averagePerformanceGrade;
    }

    public int getAverageDisciplineGrade() {
        return averageDisciplineGrade;
    }

    public int getAverageEngagementGrade() {
        return averageEngagementGrade;
    }

    public int getAverageAttendanceGrade() {
        return averageAttendanceGrade;
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

    @Override
    public String toString() {
        return name;
    }
}


