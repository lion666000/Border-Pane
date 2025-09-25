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

public class datingApp extends Application {

    @Override
    public void start(Stage primaryStage) {



        Label uvod = new Label("Formulář pro registraci nového uživatele do systému.");

        //--------------------------------------------------------------------------------------------------------------

        GridPane root = new GridPane();

        Label jmenoT = new Label("Jméno:  ");
        Label prijmeniT = new Label("Příjmení:  ");
        Label datumT = new Label("Datum Narození:  ");
        Label barvaT = new Label("Oblíbená Barva:  ");
        Label loginT = new Label("Login:  ");
        Label hesloT = new Label("Heslo:  ");

        TextField jmeno = new TextField();
        TextField prijmeni = new TextField();
        ColorPicker barva = new ColorPicker();
        DatePicker datum = new DatePicker();
        TextField login = new TextField();
        PasswordField heslo = new PasswordField();

        root.add(jmenoT, 0, 0);
        root.add(jmeno, 1, 0);
        root.add(prijmeniT, 2, 0);
        root.add(prijmeni, 3, 0);
        root.add(datumT, 0, 1);
        root.add(datum, 1, 1);
        root.add(barvaT, 2, 1);
        root.add(barva, 3, 1);
        root.add(loginT, 0, 2);
        root.add(login, 1, 2);
        root.add(hesloT, 2, 2);
        root.add(heslo, 3, 2);

        //--------------------------------------------------------------------------------------------------------------

        Label checkbox = new Label("Jazyky které ovládám:");

        CheckBox en = new CheckBox("Angličtina");
        CheckBox cz = new CheckBox("Čeština");
        CheckBox ge = new CheckBox("Němčina");
        CheckBox sp = new CheckBox("Španělština");

        HBox hbox1 = new HBox(checkbox, en, cz, ge, sp);

        //--------------------------------------------------------------------------------------------------------------

        Label souhlas = new Label("Souhlas s podmínkami:");

        RadioButton yes = new RadioButton("Ano");
        RadioButton no = new RadioButton("Ne");

        ToggleGroup ready = new ToggleGroup();
        yes.setToggleGroup(ready);
        no.setToggleGroup(ready);

        HBox hbox2 = new HBox(souhlas, yes, no);

        //--------------------------------------------------------------------------------------------------------------

        TextArea poznamky = new TextArea("Prostor pro poznámky");

        //--------------------------------------------------------------------------------------------------------------

        Label podekovani = new Label("Děkujeme vám za registraci do systému");

        //--------------------------------------------------------------------------------------------------------------





        VBox vbox = new VBox(uvod,root,hbox1,hbox2,poznamky,podekovani);

        Scene scene = new Scene(vbox, 720, 480);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
