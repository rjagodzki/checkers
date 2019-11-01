package com.checkers.scenes;

import com.checkers.background.BackgroundCreator;
import com.checkers.buttons.BackButton;
import com.checkers.label.MainLabel;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ScoreboardWindow {

    private Image backgroundImage = new Image("file:resources/menu.jpg");

    public void window(Stage stage){
        BackgroundCreator backgroundCreator = new BackgroundCreator();
        BackButton backButton = new BackButton();
        MainLabel mainLabel = new MainLabel();

        GridPane gird = new GridPane();
        gird.setBackground(backgroundCreator.setBackground(backgroundImage));

        Scene scene = new Scene(gird,1000,800, Color.WHITE);

        gird.setPadding(new Insets(10,10,10,10));
        gird.setAlignment(Pos.CENTER_RIGHT);

        gird.add(mainLabel.showLabelForScoreboard(),0,0);
        gird.add(backButton.showSmallButton(stage),0,10);

        for (int i = 0; i <= 10; i++) {
            RowConstraints con = new RowConstraints();
            con.setPrefHeight(125);
            gird.getRowConstraints().add(con);
        }

        stage.setScene(scene);
        stage.show();
    }
}
