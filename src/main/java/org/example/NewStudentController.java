package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

public class NewStudentController {

    public TextField nsNameTxtBox;
    public TextField nsSchoolTxtBox;
    public TextField nsGradeTxtBox;
    public TextField nsTutorTxtBox;
    public TextField nsAgeTxtBox;
    public TextField nsSessionsTxtBox;
    public TableView nsStudentTable;
    public ObservableList<Student> Students = FXCollections.observableArrayList();
    public TableColumn<Student, String> studentName = new TableColumn<>("name");
    public TableColumn<Student, String> studentSchool = new TableColumn<>("School");
    public TableColumn<Student, int> studentGrade = new TableColumn("");
    public TableColumn<Student, String> studentTutor = new TableColumn<>("name");
    public TableColumn<Student, int> studentAge = new TableColumn("");
    public TableColumn<Student, int> studentSessions = new TableColumn("");

    public void initialize(){
        //Start doing the process as soon as the window opens

        Students.add(new Student("", "", "", "", ""));
        loadStudents();

        studentName.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));

        nsStudentTable.getColumns().add(studentName);
        nsStudentTable.setItems(Students);

        nsStudentTable.setRowFactory(rowClick ->{
            TableRow<Student> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (!row.isEmpty() && event.getButton() == MouseButton.Primary && event.getClickCount() == 2) {
                    Student clickedRow = row.getItem();
                    nsNameTxtBox.setText(clickedRow.getName());
                    nsSchoolTxtBox.setText(clickedRow.getSchool());
                    nsGradeTxtBox.setText(Integer.toString(clickedRow.getGrade()));
                    nsTutorTxtBox.setText(clickedRow.getTutor());
                    nsAgeTxtBox.setText(Integer.toString(clickedRow.getAge()));
                    nsSessionsTxtBox.setText(Integer.toString(clickedRow.getSessions()));
        }};
    }

    private void loadStudents() {
            //load students from saved file
            //open and read Json for any previously saved data
            Gson gson = new Gson();
            try (Reader reader = new FileReader("students.json")) {
                // convert JSON file to Java Object
                ArrayList<Student> imports = gson.fromJson(reader, new TypeToken<ArrayList<Student>>() {
                }.getType());
                Students = FXCollections.observableArrayList(imports);
            }catch (IOExcepton e){
                e.printStackTrace();
        }
    }

    public void SaveBtn(ActionEvent actionEvent) {

            Boolean exists = false;
            for (Student c: students) {
                if(c.getName().equals(cName.getText())){
                    exists = true;
                    System.out.println("already exists");
                }
            }
            if(exists == false) {
                Students.add(new Student(nsNameTxtBox.getText(), nsSchoolTxtBox.getText(), Integer.parseInt(nsGradeTxtBox.getText()), nsTutorTxtBox.getText(), Integer.parseInt(nsAgeTxtBox.getText()), Integer.parseInt(nsSessionsTxtBox.getText())));
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

