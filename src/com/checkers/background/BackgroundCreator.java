package com.checkers.background;

import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class BackgroundCreator {
    private Image image;

    public Image getImage() {
        return image;
    }

    public Background setBackground(Image image){
        BackgroundSize backgroundSize = new BackgroundSize(100,100,true,true,true,false);
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        return background;

    }
}
