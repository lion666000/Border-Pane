package com.example.border_styl;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class ClickMe extends Application {

    Button tlacitko;

    @Override
    public void start(Stage primaryStage) {
        tlacitko = new Button();
        tlacitko.setText("Click Me");
        BorderPane pane = new BorderPane();
        pane.setCenter(tlacitko);
        //add this layout to the scene
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
