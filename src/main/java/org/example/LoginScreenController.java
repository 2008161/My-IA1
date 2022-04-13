package org.example;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.imageio.ImageIO;

public class LoginScreenController {

    public ImageView profileImage;
    String hardCodedPassword = "RU2004";
    public TextField userInputTextBox;

    @FXML
    public void switchToSelectFunctionMenu(ActionEvent actionEvent) throws IOException {

    if(userInputTextBox.getText().equals(hardCodedPassword)){
        App.setRoot("SelectFunctionMenu");
    }
    }

    public void initialize() throws IOException {

        Image image = new Image("/profileB.png");
        profileImage.setImage(image);
    }
}
