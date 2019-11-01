package com.checkers.label;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainLabel  {
    private Image logoLabel = new Image("file:resources/logo.png");

    public Label showLabelForMainMenu(){
        //Creating label
        Label label = new Label();
        label.setGraphic(new ImageView(logoLabel));

        return label;
    }

    public Label showLabelForScoreboard(){
        Label label = new Label();
        ImageView imageView = new ImageView(logoLabel);
        imageView.setFitHeight(150);
        imageView.setFitWidth(300);


        label.setGraphic(imageView);
        return label;
    }
}
