package org.example;

import javafx.event.ActionEvent;

import java.util.ArrayList;

public class Tutor {

    String name;
    String school;
    String tutor;
    int age;
    int sessions;

    public ArrayList<Tutor> students = new ArrayList<>();

    public Tutor(String name, String school, String tutor, int age, int sessions) {
        this.name = name;
        this.school = school;
        this.tutor = tutor;
        this.age = age;
        this.sessions = sessions;
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

