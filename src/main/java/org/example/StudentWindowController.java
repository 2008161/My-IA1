package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class StudentWindowController {

    public ImageView swProfileImage;
    public TableView swAttributesTable;
    public TableColumn swTableSchoolAttribute;
    public TableColumn swTableGradeAttribute;
    public TableColumn swTableTutorAttribute;
    public TableColumn swTableAgeAttribute;
    public TableColumn swTableSessionAttribute;
    public TextField swCriterionLetterTxtBox;
    public TextField swNewGradeTextBox;
    public TableColumn slCriterionTablePercentage;
    public TableColumn slCriterionTableCriterion;
    public TableView swCriterionTable;
    public TextField swNameTxtBox;
    public TableColumn<Student, String> studentName = new TableColumn<>("Name");
    public TableColumn<Student, String> studentSchool = new TableColumn<>("School");
    public TableColumn<Student, Integer> studentGrade = new TableColumn("Grade");
    public TableColumn<Student, String> studentTutor = new TableColumn<>("Tutor");
    public TableColumn<Student, Integer> studentAge = new TableColumn("Age");
    public TableColumn<Student, Integer> studentSessions = new TableColumn("Sessions/weeks");
    public ObservableList<Student> currentStudentList = FXCollections.observableArrayList();
    public Label currentAttendanceAverageTextBox;
    public Label currentPerformanceAverageTextBox;
    public Label currentDisciplineAverageTextBox;
    public Label currentEngagementAverageTextBox;


    public void initialize(){

        currentStudentList.add(App.students.get(App.chosenStudent));
        swNameTxtBox.setText(currentStudentList.get(0).getName());
        studentName.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        studentName.setPrefWidth(50);
        studentName.setSortable(false);
        studentSchool.setCellValueFactory(new PropertyValueFactory<Student, String>("school"));
        studentGrade.setCellValueFactory(new PropertyValueFactory<Student, Integer>("grade"));
        studentTutor.setCellValueFactory(new PropertyValueFactory<Student, String>("tutor"));
        studentAge.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
        studentSessions.setCellValueFactory(new PropertyValueFactory<Student, Integer>("sessions"));

        swAttributesTable.getColumns().addAll(studentName,studentSchool,studentGrade, studentTutor, studentAge, studentSessions);
        swAttributesTable.setItems(currentStudentList);

        currentPerformanceAverageTextBox.setText("Current Performance Average: "+ currentStudentList.get(0).getAveragePerformanceGrade());
        currentDisciplineAverageTextBox.setText("Current Discipline Average: "+ currentStudentList.get(0).getAverageDisciplineGrade());
        currentEngagementAverageTextBox.setText("Current Engagement Average: "+ currentStudentList.get(0).getAverageEngagementGrade());
        currentAttendanceAverageTextBox.setText("Current Attendance Average: "+ currentStudentList.get(0).getAverageAttendanceGrade());


    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    public void switchToLoginScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("LoginScreen");
    }

    public void switchToChangeUser(ActionEvent actionEvent) throws IOException {
        App.setRoot("ChangeUser");
    }
}
