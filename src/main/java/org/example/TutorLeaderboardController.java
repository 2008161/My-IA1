package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TutorLeaderboardController {

    public TextField tlTitleTxt;
    public ChoiceBox tlDropBox;
    public TableView tlTable;
    public TableColumn tlTableCriterion;
    public TableColumn tlTableScore;
    public TableColumn tlTableTutor;
    public TableColumn tlTableStudent;

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
