package com.checkers;

import com.checkers.scenes.MenuScene;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class Checkers extends Application {

    Image miniature = new Image("file:resources/miniature.png");

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Stage properties
        stage.setTitle("Checkers");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("miniature.png")));

        MenuScene menuWindow = new MenuScene();
        menuWindow.window(stage);



    }
}
