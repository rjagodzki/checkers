package com.checkers.scenes;

import com.checkers.background.BackgroundCreator;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//import java.awt.*;

public class InGameScene {

    private Image image = new Image("file:resources/board.jpg");

    public void scene(Stage stage) {

        BackgroundCreator background = new BackgroundCreator();
        GridPane gird = new GridPane();

        gird.setBackground(background.setBackground(image));

        Scene sc = new Scene(gird, 1200,800,Color.BROWN);

        stage.setScene(sc);
        stage.show();

    }
}
