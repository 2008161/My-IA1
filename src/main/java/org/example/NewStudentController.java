package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    public ObservableList<Student> students = FXCollections.observableArrayList();
    public TableColumn<Student, String> studentName = new TableColumn<>("name");
    public TableColumn<Student, String> studentSchool = new TableColumn<>("School");
    public TableColumn<Student, Integer> studentGrade = new TableColumn("");
    public TableColumn<Student, String> studentTutor = new TableColumn<>("name");
    public TableColumn<Student, Integer> studentAge = new TableColumn("");
    public TableColumn<Student, Integer> studentSessions = new TableColumn("");

    public void initialize() {
        //Start doing the process as soon as the window opens

        students.add(new Student("Matt", "newton", "teacher", 2, 2, 8));
        loadStudents();

        studentName.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));

        nsStudentTable.getColumns().add(studentName);
        nsStudentTable.setItems(students);

        nsStudentTable.setRowFactory(rowClick -> {
            TableRow<Student> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (!row.isEmpty() && event.getButton() == MouseButton.PRIMARY && event.getClickCount() == 2) {
                    Student clickedRow = row.getItem();
                    nsNameTxtBox.setText(clickedRow.getName());
                    nsSchoolTxtBox.setText(clickedRow.getSchool());
                    nsGradeTxtBox.setText(Integer.toString(clickedRow.getGrade()));
                    nsTutorTxtBox.setText(clickedRow.getTutor());
                    nsAgeTxtBox.setText(Integer.toString(clickedRow.getAge()));
                    nsSessionsTxtBox.setText(Integer.toString(clickedRow.getSessions()));
                }
            });
            return rowClick;
        });
    }

    private void loadStudents() throws IOException {
            //load students from saved file
            //open and read Json for any previously saved data
            Gson gson = new Gson();
            try (Reader reader = new FileReader("students.json")) {
                // convert JSON file to Java Object
                ArrayList<Student> imports = gson.fromJson(reader, new TypeToken<ArrayList<Student>>() {
                }.getType());
                students = FXCollections.observableArrayList(imports);
            }catch (FileNotFoundException e){
                e.printStackTrace();
        }
    }

    public void SaveBtn(ActionEvent actionEvent) {

            Boolean exists = false;
            //Stop duplicate student profiles from being created
                for (Student c: students) {
                if(c.getName().equals(nsNameTxtBox.getText())){
                    //if the name inputted for a new student is the same as that for a profile already created, the system will execute the action
                }
                    exists = true;
                    System.out.println("already exists");
                    //Inform the user that the profile intended to be created already exists
                }

            if(exists == false) {
                students.add(new Student(nsNameTxtBox.getText(), nsSchoolTxtBox.getText(), Integer.parseInt(nsGradeTxtBox.getText()), nsTutorTxtBox.getText(), Integer.parseInt(nsAgeTxtBox.getText()), Integer.parseInt(nsSessionsTxtBox.getText())));
            }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(FileWriter writer = new FileWriter("contacts.json")) {
            gson.toJson(students, writer);
            System.out.println("Saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //https://mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/

        }
    }
}
