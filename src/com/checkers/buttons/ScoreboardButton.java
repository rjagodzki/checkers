package com.checkers.buttons;

import com.checkers.scenes.ScoreboardWindow;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ScoreboardButton {

    private Image scoreboardButtonImage = new Image("file:resources/scoreboard.png");

    public Button showButton(Stage stage){
        ScoreboardWindow scoreboardWindow = new ScoreboardWindow();
        //Creating button
        Button button = new Button();
        button.setGraphic(new ImageView(scoreboardButtonImage));

        //Button's properties
        button.setStyle("-fx-background-color:  transparent");

        //Button's EventHandler
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                scoreboardWindow.window(stage);
            }
        });

        return button;

    }
}
