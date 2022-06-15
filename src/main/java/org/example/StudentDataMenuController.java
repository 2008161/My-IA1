package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class StudentDataMenuController {

    public ChoiceBox sdmDropBox;
    public TextField sdmTitleTxt;

    public void initialize(){
       sdmDropBox.setItems(App.students);
        //1. add all students to drop down window,.
        //2. when one student is selected show information
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

    public void switchToDropboxChoice(ActionEvent actionEvent) throws IOException {
        App.chosenStudent = sdmDropBox.getSelectionModel().getSelectedIndex();
        App.setRoot("StudentWindow");

    }
}
