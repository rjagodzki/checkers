package com.checkers.stages;

import com.checkers.background.BackgroundCreator;
import com.checkers.buttons.ExitButton;
import com.checkers.buttons.PlayButton;
import com.checkers.buttons.ScoreboardButton;
import com.checkers.label.MainLabel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class MenuWindow implements StagesInterface {


    private Image image = new Image("file:resources/menu.jpg");



    @Override
    public void window(Stage stage) {
        stage.setTitle("Checkers");

        //Creating background of menu window
        BackgroundCreator backgroundCreator = new BackgroundCreator();
        GridPane gird = new GridPane();
        gird.setBackground(backgroundCreator.setBackground(image));

        //Gird properties
        gird.setHgap(10);
        gird.setVgap(10);
        gird.setMinSize(200,400);
        gird.setPadding(new Insets(10,10,10,10));
        gird.setAlignment(Pos.CENTER);

        //Creating scene
        Scene scene = new Scene(gird, 1000, 800, Color.WHITE);

        //Buttons
        MainLabel label = new MainLabel();
        PlayButton playButton = new PlayButton();
        ScoreboardButton scoreboardButton = new ScoreboardButton();
        ExitButton exitButton = new ExitButton();

        //Menu with buttons
        gird.add(label.showLabel(),0,0);
        gird.add(playButton.showButton(stage),0,2);
        gird.add(scoreboardButton.showButton(),0,3);
        gird.add(exitButton.showButton(),0,4);
        for (int i = 0; i <= 3; i++) {
            RowConstraints con = new RowConstraints();
            con.setPrefHeight(125);
            gird.getRowConstraints().add(con);
        }

        stage.setScene(scene);

        stage.show();
    }
}

