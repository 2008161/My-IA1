package org.example;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class NewStudentController {

    public TextField nsNameTxtBox;
    public TextField nsSchoolTxtBox;
    public TextField nsGradeTxtBox;
    public TextField nsTutorTxtBox;
    public TextField nsAgeTxtBox;
    public TextField nsSessionsTxtBox;
    public TableView nsStudentTable;
    ArrayList<Student> characteristics = new ArrayList<>();
    public TableColumn<Student, String> studentName = new TableColumn<>("name");
    public TableColumn<Student, String> studentSchool = new TableColumn<>("name");
    public TableColumn<Student, int> studentGrade = new TableColumn("");
    public TableColumn<Student, String> studentTutor = new TableColumn<>("name");
    public TableColumn<Student, int> studentAge = new TableColumn("");
    public TableColumn<Student, int> studentSessions = new TableColumn("");

    public void initialize(){
        //Start doing the process as soon as the window opens
        Student.add(new Student("", "", "", "", ""));

    }

    public void SaveBtn(ActionEvent actionEvent){
        // students.add(new Student name.getText(),sSchoolTxt.getText(), sTutorTxt.getText(), Integer.parseInt(sAgeTxt.getText(), Integer.parseInt(sSessions.getText()));
    }
}
