package com.example.border_styl;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class pisswird extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane root = new GridPane();

        Label jmenoT = new Label("User ID:  ");
        Label prijmeniT = new Label("Password:  ");

        TextField userId = new TextField();
        PasswordField password = new PasswordField();

        Button submit = new Button("Submit");

        root.add(jmenoT, 0, 0);
        root.add(prijmeniT, 0, 1);
        root.add(userId, 1, 0);
        root.add(password, 1, 1);
        root.add(submit, 1, 2);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
