package com.example.border_styl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class softCock extends Application {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;


    @Override
    public void start(Stage primaryStage) {



        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button(" ");
        btn7 = new Button("7");
        btn8 = new Button("8");

        btn6.setVisible(false);


        HBox hbox1 = new HBox(btn3, btn5);
        HBox hbox2 = new HBox(btn7, btn6, btn8);

        VBox vbox = new VBox(btn1, btn2, hbox1, hbox2,btn4);


        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
