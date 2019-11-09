package com.checkers.buttons;

import com.checkers.popups.NewPlayer;
import com.checkers.scenes.InGameScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CreateNewGameButton {

    private Image createNewGameButton = new Image("file:resources/createNewGame.png");
    public Button showButton(Stage mainStage){

        Stage popup = new Stage();
        NewPlayer newPlayer = new NewPlayer();
        InGameScene inGameScene = new InGameScene();

        //Creating button
        Button button = new Button();
        button.setGraphic(new ImageView(createNewGameButton));

        //Button's properties
        button.setStyle("-fx-background-color:  transparent");

        //Button's EventHandler
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newPlayer.newPlayerScene(popup);
                inGameScene.scene(mainStage);
                System.out.println("TO dziala?");
            }
        });
        return button;
    }
}
