package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class SelectFunctionMenuController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}