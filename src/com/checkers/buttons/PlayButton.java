package com.checkers.buttons;

import com.checkers.stages.InGameWindow;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class PlayButton{

    private Image playButtonImage = new Image("file:resources/play.png");

    public Button showButton(Stage stage){
        InGameWindow inGameWindow = new InGameWindow();
        //Creating button
        Button button = new Button();
        button.setGraphic(new ImageView(playButtonImage));

        //Button's properties
        button.setStyle("-fx-background-color:  transparent");

        //Button's EventHandler
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                inGameWindow.window(stage);
                System.out.println("TO dziala?");
            }
        });
        return button;

    }
}
