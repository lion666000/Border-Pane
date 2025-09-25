package com.example.border_styl;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class binLabin extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane root = new GridPane();

        Label jmenoT = new Label("Zadej jméno:  ");
        Label prijmeniT = new Label("Zadej příjmení:  ");

        TextField jmeno = new TextField();
        TextField prijmeni = new TextField();

        root.add(jmenoT, 0, 0);
        root.add(prijmeniT, 0, 1);
        root.add(jmeno, 1, 0);
        root.add(prijmeni, 1, 1);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
