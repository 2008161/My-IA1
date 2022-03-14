package org.example;

import javafx.fxml.FXML;

import java.io.IOException;

public class TutorWindowController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
