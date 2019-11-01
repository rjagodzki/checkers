package com.checkers.scenes.template;

import com.checkers.background.BackgroundCreator;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class SceneCreator {

    private Image mainBackground = new Image("file:resources/menu.jpg");

    public Scene mainScene(){
        //Creating background of menu window
        BackgroundCreator backgroundCreator = new BackgroundCreator();
        GridPane gird = new GridPane();
        gird.setBackground(backgroundCreator.setBackground(mainBackground));

        //Gird properties
        gird.setHgap(10);
        gird.setVgap(10);
        gird.setMinSize(200,400);
        gird.setPadding(new Insets(10,10,10,10));
        gird.setAlignment(Pos.CENTER);

        //Creating scene
        Scene scene = new Scene(gird, 1000, 800, Color.WHITE);



        return scene;
    }
}
