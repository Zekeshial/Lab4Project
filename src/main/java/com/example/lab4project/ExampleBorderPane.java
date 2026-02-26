package com.example.lab4project;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.io.IOException;


public class ExampleBorderPane extends Application {

    public void onButtonOneClick(String name) {
        System.out.println("Your name is: " + name);
        System.out.println("Button has been clicked");
    }
    public void onButtonTwoClick() {

    }

    @Override
    public void start(Stage stage) throws IOException {




        //Creating the borderPane
        BorderPane borderPane = new BorderPane();

        //Creating a group for all the children of pane
        Group group = new Group();

        //Canvas of the UI
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();


        //Drawing a rectangle on the canvas
        graphicsContext.setFill(Color.BLUE);
        graphicsContext.fillRect(0, 0, 400, 300);




        //Creating pane of vbox
        VBox vBox = new VBox(25);

        //Creating pane of Hbox
        HBox hBox = new HBox(25);


        //title pane information
        Label buttonOneInformation = new Label("Type your Name in the Box Bellow." +
                "\nThen press the button to have your name Displayed.");



        //Text field pane information
        TextField userNameField = new TextField();
        userNameField.setPromptText("Enter your Name here");

        //Button pane information

        //Button Sumbit info
        Button buttonOne = new Button("Submit");
        buttonOne.setOnAction(event -> {
            //Clearing the Canvas
            graphicsContext.clearRect(0,0, canvas.getWidth(), canvas.getHeight());
            graphicsContext.setFill(Color.BLUE);
            graphicsContext.fillRect(0, 0, 400, 300);

            //Creating the Name unto the Canvas
            String text = userNameField.getText();
            graphicsContext.setFont(new Font("Times New Romans", 40));
            graphicsContext.setFill(Color.BLACK);
            graphicsContext.fillText(text, 0, 150);
        });

        //Clear button info
        Button buttonTwo = new Button("Clear");
        buttonTwo.setOnAction(event -> {
            //Clearing the Name Field
            userNameField.clear();
            //Clearing the Canvas
            graphicsContext.clearRect(0,0, canvas.getWidth(), canvas.getHeight());
            graphicsContext.setFill(Color.BLUE);
            graphicsContext.fillRect(0, 0, 400, 300);
        });

        //Close Application button info
        Button buttonThree = new Button("Close Application");
        buttonThree.setOnAction(event -> stage.close());



        //adding objects to Hbox
        hBox.getChildren().add(buttonOne);
        hBox.getChildren().add(buttonTwo);
        hBox.getChildren().add(buttonThree);




        //adding objects to vbox
        vBox.getChildren().add(buttonOneInformation);
        vBox.getChildren().add(userNameField);


        //Adding objects to the BorderPane
        borderPane.setTop(vBox);
        borderPane.setBottom(hBox);
        borderPane.setCenter(canvas);


        //Adding objects to the group
        group.getChildren().add(borderPane);







        //Setting scene
        Scene scene = new Scene(group, 800, 600);
        scene.setFill(Color.BEIGE);

        //setting stage
        stage.setScene(scene);
        stage.setTitle("My first vbox javaFX");

        //Showing stage
        stage.show();

    }

    static void main(String[] args) {
        launch(args);
    }
}
