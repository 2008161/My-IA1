package org.example;

import javafx.fxml.FXML;

import java.io.IOException;

public class StudentDataMenuController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
