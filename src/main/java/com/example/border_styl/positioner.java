package com.example.border_styl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class positioner extends Application {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;



    @Override
    public void start(Stage primaryStage) {



        btn1 = new Button("tlacitko1");
        btn2 = new Button("tlacitko2");
        btn3 = new Button("tlacitko3");
        btn4 = new Button("tlacitko4");




        HBox hbox = new HBox(btn3, btn4);
        VBox vbox = new VBox(btn1, btn2, hbox);

        hbox.setSpacing(20);
        vbox.setPadding(new Insets(20,10,10,5));
        hbox.setPadding(new Insets(-10,10,10,75));




        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
