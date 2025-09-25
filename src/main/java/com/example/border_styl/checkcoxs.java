package com.example.border_styl;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class checkcoxs extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane root = new GridPane();



        RadioButton beef = new RadioButton("Bif");
        RadioButton chicken = new RadioButton("Chimken");
        RadioButton veggie = new RadioButton("Vagtable");

        CheckBox ketchup = new CheckBox("Ketchup");
        CheckBox mustard = new CheckBox("MUSTARD !!");
        CheckBox pickles = new CheckBox("Pickles");

        Button submit = new Button("Place Order");

        ToggleGroup ready = new ToggleGroup();
        beef.setToggleGroup(ready);
        chicken.setToggleGroup(ready);
        veggie.setToggleGroup(ready);

        root.add(beef, 0, 0);
        root.add(chicken, 1, 0);
        root.add(veggie, 2, 0);
        root.add(ketchup, 0, 1);
        root.add(mustard, 1, 1);
        root.add(pickles, 2, 1);
        root.add(submit, 1, 2);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
