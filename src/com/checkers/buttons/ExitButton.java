package com.checkers.buttons;

import com.checkers.stages.InGameWindow;
import com.checkers.stages.MenuWindow;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.WindowEvent;

public class ExitButton {

    public Button showButton(){

        Image playButton = new Image("file:resources/exit.png");
        Button button = new Button();
        button.setGraphic(new ImageView(playButton));

        button.setStyle("-fx-background-color:  transparent");

        //Button's EventHandler
//        button.addEventHandler(new EventHandler<WindowEvent>(){
//            @Override
//            public void handle(WindowEvent event) {
//                System.exit(0);
//            }
//        });
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        return button;

    }
}
