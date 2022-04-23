package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class ChangeUserController {

    public TextField cuTitleTxt;
    public ImageView cuUserProfileImage;
    public TextArea cuInputUserLoginTxtBox;

        public TextField userInputTextBox;
        @FXML
    public void switchToSelectFunctionMenu(ActionEvent actionEvent) throws IOException {
        App.setRoot("SelectFunctionMenu");
    }
}
