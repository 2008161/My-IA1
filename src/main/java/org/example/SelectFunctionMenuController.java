package org.example;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class SelectFunctionMenuController {

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
        App.setRoot("Student Data Menu"); //go to the right window

        App.setRoot("Student Data Leaderboard");
        App.setRoot("Tutor Data Menu");
        App.setRoot("Tutor Data Leaderboard");
        //else if it is 2, go to the other window etc.
    }

    public void switchToLoginScreen(ActionEvent actionEvent) throws IOException {
        App.setRoot("LoginScreen");
    }

    public void switchToChangeUser(ActionEvent actionEvent) throws IOException {
        App.setRoot("ChangeUser");
    }

    public void switchToOption1(ActionEvent actionEvent) throws IOException {
        App.setRoot("");
    }
}