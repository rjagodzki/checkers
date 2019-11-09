package com.checkers.popups;


import com.checkers.Checkers;
import com.checkers.player.Player;
import com.checkers.popups.template.PopupCreator;
import com.checkers.scenes.InGameScene;
import com.checkers.scenes.MenuScene;
import com.checkers.scenes.NewOrResumeGameScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewPlayer {

    private String playerName;

//    private Image miniature = new Image("file:resources/miniature.png");

    public void newPlayerScene(Stage stage){
        String playerName = null;

        PopupCreator popupCreator = new PopupCreator();
        Scene scene = popupCreator.scene();
        GridPane grid = (GridPane)scene.getRoot();

        Label title = new Label("New Player");
        title.setLabelFor(grid);

        TextArea input = new TextArea();
        input.setPrefRowCount(1);
        input.setPrefColumnCount(9);
        playerName = input.getText();

        Button accept = new Button("Accept");

        grid.add(title,0,0);
        grid.add(input,0,1);
        grid.add(accept,0,2);


        accept.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                if(!input.equals("")){

                    System.out.println("Nie ma tekstu!");

                    stage.close();
                }
        }});

        grid.setMaxSize(300,300);
        grid.setGridLinesVisible(false);
        grid.setAlignment(Pos.CENTER);
        stage.setTitle("New Game");
        stage.initStyle(StageStyle.UTILITY);
        stage.setAlwaysOnTop(true);

        stage.setScene(scene);
        stage.show();

    }
}
