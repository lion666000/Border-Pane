package com.example.border_styl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class kokot extends Application {
    Button btn1;
    Button btn2;

    @Override
    public void start(Stage primaryStage) {



        btn1 = new Button("1");
        btn2 = new Button("2");

        VBox vbox = new VBox(btn1, btn2);

        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
