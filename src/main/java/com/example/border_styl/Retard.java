package com.example.border_styl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class Retard extends Application {

        Button btn1;
        Button btn2;

        @Override
        public void start(Stage primaryStage) {



            btn1 = new Button("1");
            btn2 = new Button("2");

            HBox hbox = new HBox(btn1, btn2);

            Scene scene = new Scene(hbox, 300, 200);

            primaryStage.setScene(scene);
            primaryStage.show();


        }

        public static void main(String[] args) {
            launch(args);
        }
}
