package com.checkers.scenes;

import com.checkers.background.BackgroundCreator;
import com.checkers.buttons.BackButton;
import com.checkers.buttons.CreateNewGameButton;
import com.checkers.buttons.ResumeLastGameButton;
import com.checkers.label.MainLabel;

import com.checkers.scenes.template.SceneCreator;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class NewOrResumeGameScene {

    private Image backgroundImage = new Image("file:resources/menu.jpg");

    public void scene(Stage stage){

        //Taking scene and grid from template
        SceneCreator sceneCreator = new SceneCreator();
        Scene scene = sceneCreator.mainScene();
        GridPane grid = (GridPane) scene.getRoot();

        //Creating menu
        MainLabel mainLabel = new MainLabel();
        CreateNewGameButton createNewGameButton = new CreateNewGameButton();
        ResumeLastGameButton resumeLastGameButton = new ResumeLastGameButton();
        BackButton backButton = new BackButton();

        //Adding label and buttons
        grid.add(mainLabel.showLabelForMainMenu(),0,0);
        grid.add(createNewGameButton.showButton(stage),0,2);
        grid.add(resumeLastGameButton.showButton(stage),0,3);
        grid.add(backButton.showBigButton(stage),0,4);

        for (int i = 0; i <= 4; i++) {
            RowConstraints con = new RowConstraints();
            con.setPrefHeight(124);
            grid.getRowConstraints().add(con);
        }

        stage.setScene(scene);
        stage.show();
    }
}
