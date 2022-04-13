package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class StudentLeaderboardController {

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
