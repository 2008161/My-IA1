package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;

import java.io.*;
import java.util.ArrayList;

public class NewStudentController {

    public TextField nsNameTxtBox;
    public TextField nsSchoolTxtBox;
    public TextField nsGradeTxtBox;
    public TextField nsTutorTxtBox;
    public TextField nsAgeTxtBox;
    public TextField nsSessionsTxtBox;
    public TableView nsStudentTable;
    public TableColumn<Student, String> studentName = new TableColumn<>("Name");
    public TableColumn<Student, String> studentSchool = new TableColumn<>("School");
    public TableColumn<Student, Integer> studentGrade = new TableColumn("Grade");
    public TableColumn<Student, String> studentTutor = new TableColumn<>("Tutor");
    public TableColumn<Student, Integer> studentAge = new TableColumn("Age");
    public TableColumn<Student, Integer> studentSessions = new TableColumn("Sessions/weeks");

    public void initialize() throws IOException {
        //Start doing the process as soon as the window opens



        studentName.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        studentName.setPrefWidth(50);
        studentName.setSortable(false);
        studentSchool.setCellValueFactory(new PropertyValueFactory<Student, String>("school"));
        studentGrade.setCellValueFactory(new PropertyValueFactory<Student, Integer>("grade"));
        studentTutor.setCellValueFactory(new PropertyValueFactory<Student, String>("tutor"));
        studentAge.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
        studentSessions.setCellValueFactory(new PropertyValueFactory<Student, Integer>("sessions"));

        nsStudentTable.getColumns().addAll(studentName,studentSchool,studentGrade, studentTutor, studentAge, studentSessions);

        nsStudentTable.setItems(App.students);


        nsStudentTable.setRowFactory(rowClick -> {
            TableRow<Student> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (!row.isEmpty() && event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2) {
                    Student clickedRow = row.getItem();
                    //when the user double clicks over a specific cell belonging to a row and column, it will get the item belonging to such space
                    nsNameTxtBox.setText(clickedRow.getName());
                    nsSchoolTxtBox.setText(clickedRow.getSchool());
                    nsGradeTxtBox.setText(Integer.toString(clickedRow.getGrade()));
                    nsTutorTxtBox.setText(clickedRow.getTutor());
                    nsAgeTxtBox.setText(Integer.toString(clickedRow.getAge()));
                    nsSessionsTxtBox.setText(Integer.toString(clickedRow.getSessions()));
                    //the method includes each of the different possible cells as all the different rows are included in the method
                    //https://docs.oracle.com/javafx/2/events/convenience_methods.htm
                }
            });
            return rowClick;
        });

    }



    public void SaveBtn(ActionEvent actionEvent) {

            Boolean exists = false;
            //Stop duplicate student profiles from being created
                for (Student c: App.students) {
                    if (c.getName().equals(nsNameTxtBox.getText())) {
                        //if the name inputted for a new student is the same as that for a profile already created, the system will execute the action
                        exists = true;
                        System.out.println("already exists");
                        //Inform the user that the profile intended to be created already exists
                    }
                }

            if(exists == false) {
                App.students.add(new Student(nsNameTxtBox.getText(), nsSchoolTxtBox.getText(),  nsTutorTxtBox.getText(),Integer.parseInt(nsGradeTxtBox.getText()), Integer.parseInt(nsAgeTxtBox.getText()), Integer.parseInt(nsSessionsTxtBox.getText())));
            }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(FileWriter writer = new FileWriter("students.json")) {
            gson.toJson(App.students, writer);
            System.out.println("Saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //https://mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/
        }

    public void BackToMainScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("SelectFunctionMenu");
    }
}
