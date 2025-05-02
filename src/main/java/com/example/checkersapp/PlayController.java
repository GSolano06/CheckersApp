package com.example.checkersapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PlayController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}