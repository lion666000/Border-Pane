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
        BorderPane root = new BorderPane();
        root.setTop(tlacitko);
        tlacitko = new Button();
        tlacitko.setText("Click Me");
        BorderPane pane = new BorderPane();
        pane.setCenter(tlacitko);
        //add this layout to the scene
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        tlacitko = new Button("Top");
        pane.setTop(tlacitko);

        tlacitko = new Button("Bottom");
        pane.setBottom(tlacitko);

        tlacitko = new Button("Center");
        pane.setCenter(tlacitko);

        tlacitko = new Button("Left");
        pane.setLeft(tlacitko);

        tlacitko = new Button("Right");
        pane.setRight(tlacitko);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
