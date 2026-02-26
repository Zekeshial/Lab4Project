package com.example.lab4project;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Pane setOfUIComponents = new Pane();
        Scene scene = new Scene(setOfUIComponents, 320, 240);
        Label l = new Label("Hello!");
        Label l2 = new Label("This is a new message.");
        Button button = new Button ("Button ");




        setOfUIComponents.getChildren().add(l2);
        setOfUIComponents.getChildren().add(l);
        setOfUIComponents.getChildren().add(button);


        stage.setScene(scene);
        scene.setFill(Color.BLUEVIOLET);

        stage.setResizable(true);
        stage.setTitle("My First JavaFX App");

        stage.show();
    }
}


