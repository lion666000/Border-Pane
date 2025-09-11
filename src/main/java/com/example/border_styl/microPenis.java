package com.example.border_styl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class microPenis extends Application {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;

    @Override
    public void start(Stage primaryStage) {



        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");

        VBox vbox = new VBox(btn1,btn2);
        HBox hbox = new HBox(btn3, vbox, btn4);

        Scene scene = new Scene(hbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
