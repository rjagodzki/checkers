package com.checkers.label;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainLabel {
    private Image logoLabel = new Image("file:resources/logo.png");

    public Label showLabel(){
        //Creating label
        Label label = new Label();
        label.setGraphic(new ImageView(logoLabel));

        return label;
    }
}
