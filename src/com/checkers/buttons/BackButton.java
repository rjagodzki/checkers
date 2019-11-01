package com.checkers.buttons;

import com.checkers.scenes.MenuScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class BackButton {

    private Image backButtonImage = new Image("file:resources/back.png");
    private Image bigBackButtonImage = new Image("file:resources/bigBack.png");

    public Button showSmallButton(Stage stage){
        MenuScene menuWindow = new MenuScene();

        Button button = new Button();

        button.setGraphic(new ImageView(backButtonImage));
        button.setPrefSize(300,100);
        button.setStyle("-fx-background-color:  transparent");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                menuWindow.window(stage);
            }
        });

        return button;
    }
    public Button showBigButton(Stage stage){
        MenuScene menuWindow = new MenuScene();

        Button button = new Button();

        button.setGraphic(new ImageView(bigBackButtonImage));
        button.setPrefSize(300,100);
        button.setStyle("-fx-background-color:  transparent");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                menuWindow.window(stage);
            }
        });

        return button;
    }

}
