package com.checkers.stages;

import com.checkers.background.BackgroundCreator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.logging.Handler;
import java.util.stream.*;

//import java.awt.*;

public class InGameWindow{

    private Image image = new Image("file:resources/board.jpg");

//    @Override
    public void window(Stage stage) {
//        Stage stage = new Stage();


        BackgroundCreator background = new BackgroundCreator();
        GridPane gird = new GridPane();

        gird.setBackground(background.setBackground(image));

        Scene sc = new Scene(gird, 1200,800,Color.BROWN);

        stage.setScene(sc);
        stage.show();

    }
}
