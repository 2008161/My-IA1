package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class StudentLeaderboardController {

    public TextField slTitleTxt;
    public ChoiceBox slDropBoxTxt;
    public TableView slTable;
    public TableColumn slTableCriterion;
    public TableColumn slTableScore;
    public TableColumn slTableTutor;
    public TableColumn slTableStudent;

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
