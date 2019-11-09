package com.checkers;

import com.checkers.scenes.MenuScene;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Checkers extends Application {

    public static void main(String[] args){
        launch(args);
    }


    @Override
    public void start(Stage mainStage) throws Exception {
        //Stage properties
        mainStage.setTitle("Checkers");
        mainStage.getIcons().add(new Image(getClass().getResourceAsStream("miniature.png")));
        //mainStage.initStyle(StageStyle.TRANSPARENT);


        MenuScene menuWindow = new MenuScene();
        menuWindow.window(mainStage);



    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }
}
