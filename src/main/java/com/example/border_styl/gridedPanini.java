package com.example.border_styl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class gridedPanini extends Application {



    @Override
    public void start(Stage primaryStage) {

        GridPane root = new GridPane();

        Button lbl = new Button("Label1");
        Button lbl2 = new Button("Label2");

        root.add(lbl, 0, 0);
        root.add(lbl2, 1, 1);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
