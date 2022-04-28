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
                    "Student Data Leaderboard",
                    "Tutor Data Menu",
                    "Tutor Data Leaderboard"
            );

    public void initialize(){
        windowChoiceBox.setItems(options);
    }


    @FXML
    private void switchToOptions() throws IOException {

        //If the choicebox selection is 1
        if(windowChoiceBox.getSelectionModel().getSelectedItem().toString().equals("Student Data Menu")){
            App.setRoot("StudentDataMenu"); //go to the Student Data Menu window
        }else if(windowChoiceBox.getSelectionModel().getSelectedItem().toString().equals("Student Data Leaderboard"))
        {
            App.setRoot("StudentDataLeaderboard");
        }else if(windowChoiceBox.getSelectionModel().getSelectedItem().toString().equals("Tutor Data Menu")) {
            App.setRoot("TutorDataMenu");
        }else{
            App.setRoot("TutorLeaderboard");
        }
        //else if it is 2, go to the other window etc.
    }
    public void switchToLoginScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("LoginScreen");
    }

    public void switchToChangeUser(ActionEvent actionEvent) throws IOException {
        App.setRoot("ChangeUser");

    }
}