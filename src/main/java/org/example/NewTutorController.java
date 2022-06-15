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

public class NewTutorController {

        public TextField ntNameTxtBox;
        public TextField ntSchoolTxtBox;
        public TextField ntGradeTxtBox;
        public TextField ntTutorTxtBox;
        public TextField ntAgeTxtBox;
        public TextField ntSessionsTxtBox;
        public TableView ntTutorTable;
        public TableColumn<Tutor, String> tutorName = new TableColumn<>("Name");
        public TableColumn<Tutor, String> tutorSchool = new TableColumn<>("School");
        public TableColumn<Tutor, Integer> tutorGrade = new TableColumn("Grade");
        public TableColumn<Tutor, String> tutorStudent = new TableColumn<>("Tutor");
        public TableColumn<Tutor, Integer> tutorAge = new TableColumn("Age");
        public TableColumn<Tutor, Integer> tutorSessions = new TableColumn("Sessions/weeks");

    public void initialize() throws IOException {
            //Start doing the process as soon as the window opens

            loadTutors();

            tutorName.setCellValueFactory(new PropertyValueFactory<Tutor, String>("name"));
            tutorSchool.setCellValueFactory(new PropertyValueFactory<Tutor, String>("school"));
            tutorGrade.setCellValueFactory(new PropertyValueFactory<Tutor, Integer>("grade"));
            tutorStudent.setCellValueFactory(new PropertyValueFactory<Tutor, String>("tutor"));
            tutorAge.setCellValueFactory(new PropertyValueFactory<Tutor, Integer>("age"));
            tutorSessions.setCellValueFactory(new PropertyValueFactory<Tutor, Integer>("sessions"));

            ntTutorTable.getColumns().addAll(tutorName,tutorSchool,tutorGrade, tutorStudent, tutorAge, tutorSessions);
            for (Tutor s: App.tutors
            ) {
                System.out.println(s.getName());
            }
            ntTutorTable.setItems(App.tutors);

            /**
             ntTutorTable.setRowFactory(rowClick -> {
             TableRow<Tutor> row = new TableRow<>();
             row.setOnMouseClicked(event -> {
             if (!row.isEmpty() && event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2) {
             Student clickedRow = row.getItem();
             //when the user double clicks over a specific cell belonging to a row and column, it will get the item belonging to such space
             ntNameTxtBox.setText(clickedRow.getName());
             ntSchoolTxtBox.setText(clickedRow.getSchool());
             ntGradeTxtBox.setText(Integer.toString(clickedRow.getGrade()));
             ntTutorTxtBox.setText(clickedRow.getTutor());
             ntAgeTxtBox.setText(Integer.toString(clickedRow.getAge()));
             ntSessionsTxtBox.setText(Integer.toString(clickedRow.getSessions()));
             //the method includes each of the different possible cells as all the different rows are included in the method
             //https://docs.oracle.com/javafx/2/events/convenience_methods.htm
             }
             });
             return rowClick;
             });
             **/
        }

        private void loadTutors() throws IOException {
            //load tutors from saved file
            //open and read Json for any previously saved data
            Gson gson = new Gson();
            try (Reader reader = new FileReader("tutors.json")) {
                // convert JSON file to Java Object
                ArrayList<Tutor> imports = gson.fromJson(reader, new TypeToken<ArrayList<Tutor>>() {
                }.getType());
                App.tutors = FXCollections.observableArrayList(imports);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }
        }

        public void SaveBtn(ActionEvent actionEvent) {

            Boolean exists = false;
            //Stop duplicate student profiles from being created
            for (Tutor c: App.tutors) {
                if (c.getName().equals(ntNameTxtBox.getText())) {
                    //if the name inputted for a new student is the same as that for a profile already created, the system will execute the action
                    exists = true;
                    System.out.println("already exists");
                    //Inform the user that the profile intended to be created already exists
                }
            }

            if(exists == false) {
                App.tutors.add(new Tutor(ntNameTxtBox.getText(), ntSchoolTxtBox.getText(),  ntTutorTxtBox.getText(),Integer.parseInt(ntGradeTxtBox.getText()), Integer.parseInt(ntAgeTxtBox.getText()), Integer.parseInt(ntSessionsTxtBox.getText())));
            }

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            try(FileWriter writer = new FileWriter("tutors.json")) {
                gson.toJson(App.tutors, writer);
                System.out.println("Saved.");
            } catch (IOException e) {
                e.printStackTrace();
            }
            //https://mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api///
    }

    public void BackToMainScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("SelectFunctionMenu");
    }
}
