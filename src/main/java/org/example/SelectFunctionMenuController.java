package org.example;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

public class SelectFunctionMenuController {

    public TextArea sfmMessageTxt;
    public ChoiceBox windowChoiceBox;

    ObservableList<String> options =
            FXCollections.observableArrayList(
                    "Student Data Menu",
                    "Student Leaderboard",
                    "Tutor Data Menu",
                    "Tutor Leaderboard"
            );

    public void initialize(){
        windowChoiceBox.setItems(options);
    }

    @FXML
    private void switchToOptions() throws IOException {

        if(windowChoiceBox.getSelectionModel().getSelectedItem().toString().equals("Student Data Menu")){
            App.setRoot("StudentDataMenu"); //go to the Student Data Menu window
        }else if(windowChoiceBox.getSelectionModel().getSelectedItem().toString().equals("Student Leaderboard")){
            App.setRoot("StudentLeaderboard");// go to the Student Leaderboard window
        }else if(windowChoiceBox.getSelectionModel().getSelectedItem().toString().equals("Tutor Data Menu")) {
            App.setRoot("TutorDataMenu"); // go to the Tutor Data Menu window
        }else{
            App.setRoot("TutorLeaderboard"); // go to the Tutor Leaderboard Data window
        }
    }
    public void switchToLoginScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("LoginScreen");
    }

    public void switchToChangeUser(ActionEvent actionEvent) throws IOException {
        App.setRoot("NewProfile");
    }
}