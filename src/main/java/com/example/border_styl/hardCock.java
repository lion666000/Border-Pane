package com.example.border_styl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class hardCock extends Application {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    @Override
    public void start(Stage primaryStage) {



        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");

        HBox hbox = new HBox(btn4, btn5, btn3);

        VBox vbox = new VBox(btn2, hbox,btn1);


        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
