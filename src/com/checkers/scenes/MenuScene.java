package com.checkers.scenes;

import com.checkers.background.BackgroundCreator;
import com.checkers.buttons.ExitButton;
import com.checkers.buttons.PlayButton;
import com.checkers.buttons.ScoreboardButton;
import com.checkers.label.MainLabel;
import com.checkers.scenes.template.SceneCreator;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MenuScene{

    private  Stage mainStage;

    public void window(Stage mainStage) {
        //Taking scene and grid from template
        SceneCreator sceneCreator = new SceneCreator();
        Scene scene = sceneCreator.mainScene();
        GridPane grid = (GridPane) scene.getRoot();

        //Buttons
        MainLabel label = new MainLabel();
        PlayButton playButton = new PlayButton();
        ScoreboardButton scoreboardButton = new ScoreboardButton();
        ExitButton exitButton = new ExitButton();

        //Menu with buttons
        grid.add(label.showLabelForMainMenu(),0,0);
        grid.add(playButton.showButton(mainStage),0,2);
        grid.add(scoreboardButton.showButton(mainStage),0,3);
        grid.add(exitButton.showButton(),0,4);
        for (int i = 0; i <= 3; i++) {
            RowConstraints con = new RowConstraints();
            con.setPrefHeight(125);
            grid.getRowConstraints().add(con);
        }

        mainStage.setScene(scene);

        mainStage.show();
    }

    public Stage getMainStage() {
        return mainStage;
    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }
}

