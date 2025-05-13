package com.example.checkersapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class StartController {
    @FXML
    public Button playButton;
    Socket socket;
    ShoebQueue in;
    PrintWriter socketOut;
    @FXML

    public void initialize() {
        in = new ShoebQueue();
    }
    public void connectButtonClick() throws Exception {
        String hostName = "127.0.0.1";
        Integer port = 23457;
        in = new ShoebQueue();

        socket = new Socket(hostName, port);

        ReaderThread read1 = new ReaderThread(socket, in);
        Thread reader = new Thread(read1);
        reader.start();

        WriterThread write1 = new WriterThread(socket, in, this);
        Thread writer = new Thread(write1);
        writer.start();

        socketOut = new PrintWriter(socket.getOutputStream(), true);


        System.out.println("play called");
        FXMLLoader fxmlLoader = new            FXMLLoader(CheckersApplication.class.getResource("playView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 650);
        Stage playStage = (Stage)playButton.getScene().getWindow();
        playStage.setTitle("CheckersApp");
        playStage.setScene(scene);
        playStage.show();

    }
}