package com.checkers;

import com.checkers.background.BackgroundCreator;
import com.checkers.stages.InGameWindow;
import com.checkers.stages.MenuWindow;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;

import java.awt.*;

public class Checkers extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        MenuWindow menuWindow = new MenuWindow();
        menuWindow.window(stage);



    }
}
