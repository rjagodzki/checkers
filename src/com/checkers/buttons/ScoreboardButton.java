package com.checkers.buttons;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ScoreboardButton {

    private Image scoreboardButtonImage = new Image("file:resources/scoreboard.png");

    public Button showButton(){
        //Creating button
        Button button = new Button();
        button.setGraphic(new ImageView(scoreboardButtonImage));

        //Button's properties
        button.setStyle("-fx-background-color:  transparent");

        return button;

    }
}
