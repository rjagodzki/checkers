package com.checkers.popups.template;

import com.checkers.background.BackgroundCreator;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PopupCreator {


    public Scene scene(){
        GridPane gird = new GridPane();


        //Gird properties
        gird.setHgap(10);
        gird.setVgap(10);
        gird.setMinSize(200,400);
        gird.setPadding(new Insets(10,10,10,10));
        gird.setAlignment(Pos.CENTER);

        //Creating scene
        Scene scene = new Scene(gird, 200, 150, Color.WHITE);


        return scene;
    }

}
