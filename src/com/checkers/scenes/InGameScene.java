package com.checkers.scenes;

import com.checkers.background.BackgroundCreator;
import javafx.event.EventHandler;
import javafx.geometry.*;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

//import java.awt.*;

public class InGameScene {

    private final int size = 8;

    private Image boardImage = new Image("file:resources/board.jpg");
    private Image orangePawn =  new Image("file:resources/orangePawn.png");
    private Image whitePawn = new Image("file:resources/whitePawn.png");

    private ImageView orangeImageView = new ImageView(orangePawn);
    private ImageView whiteImageView = new ImageView(whitePawn);

    private StackPane square;

    private List<Node> listOfSquares;
    public void scene(Stage mainStage) {

        BackgroundCreator background = new BackgroundCreator();
        GridPane gird = new GridPane();
        gird.setPadding(new Insets(90,288,90,288));
        Scene sc = new Scene(gird, 1200,800,Color.BROWN);

        for(int row = 0; row < size; row ++){
            for(int col = 0; col < size; col++){
                square = new StackPane();
                square.setMaxSize(Control.USE_PREF_SIZE, Control.USE_PREF_SIZE);
                square.setStyle("-fx-background-color: transparent");

                if(((row + col) % 2 != 0)){
                    if(!(row == 3 || row == 4)){
                        if(row == 0 || row == 1 || row ==2){
                            square.setLayoutX(row);
                            square.setLayoutY(col);
                            square.setLayoutX(row);
//                            square.setc
                            square.getChildren().add(orangeImageView);
//                            System.out.println(row + " " + col);
                            System.out.println(square.getLayoutY() + " " + square.getLayoutX());
                                            gird.add(square,col,row);
                        }
                        else{
                            square.getChildren().add(whiteImageView);
                                            gird.add(square,col,row);
                        }
                    }

                }

//                gird.add(square,col,row);
                orangeImageView = new ImageView(orangePawn);
                whiteImageView = new ImageView(whitePawn);
                listOfSquares = gird.getChildren();
            }
        }

        for (int i = 0; i < size; i++) {
            gird.getColumnConstraints().add(new ColumnConstraints(5, Control.USE_PREF_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, HPos.CENTER, true));
            gird.getRowConstraints().add(new RowConstraints(5, Control.USE_PREF_SIZE, Double.POSITIVE_INFINITY, Priority.ALWAYS, VPos.CENTER, true));
        }

        System.out.println("Petla FOR ");
//        for(int i = 0; i<gird.getChildren().size(); i++) {
//            System.out.println(gird.toString());
//            System.out.println(i + " Square: " + square.getLayoutY() + " " + square.getLayoutX());
            System.out.println();

            gird.setOnDragDetected(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    Dragboard db = gird.startDragAndDrop(TransferMode.ANY);
                    ClipboardContent content = new ClipboardContent();
                    if(db.getDragView()==orangePawn){ //cos tu zmienic
                        db.setDragView(orangePawn);
                    }else {
                        db.setDragView(whitePawn);
                    }
                    content.putString("Hello");
                    db.setContent(content);
                    System.out.println("setOnDragDetected");

                    System.out.println("Mouse detected!");
                    event.consume();
                }
            });
            gird.setOnDragOver(new EventHandler<DragEvent>(){
                @Override
                public void handle(DragEvent e){
                    e.acceptTransferModes(TransferMode.COPY_OR_MOVE);
                    System.out.println("dragOverDetected");
                    e.consume();
                }
            });
            gird.setOnDragEntered(new EventHandler<DragEvent>() {
                @Override
                public void handle(DragEvent event) {
                    System.out.println("onDragEntered");


                }
            });
            gird.setOnDragExited(new EventHandler<DragEvent>() {
                @Override
                public void handle(DragEvent event) {
                    System.out.println("onDragExited");

                }
            });
            gird.setOnDragDropped(new EventHandler<DragEvent>(){
                @Override
                public void handle(DragEvent e){
                    e.acceptTransferModes(TransferMode.MOVE);
                    System.out.println("dropDetected");
                    e.consume();
                }
            });
            gird.setOnDragDone(new EventHandler<DragEvent>() {
                @Override
                public void handle(DragEvent event) {
                    System.out.println("setOnDragDone");

                }
            });
            gird.setOnDragDropped(new EventHandler<DragEvent>() {
                @Override
                public void handle(DragEvent event) {
                    event.setDropCompleted(true);
                }
            });


//        }
//            for(Node square : listOfSquares){

//
//
//        for (int i = 0; i < 24; i++){
//            square.setOnDragDetected(new EventHandler<MouseEvent>(){
//                @Override
//                public void handle(MouseEvent e){
//                    for(int i = 0; i < 24; i++){
//                    }}
//            });
//            gird.setOnDragDropped(new EventHandler<DragEvent>(){
//                @Override
//                public void handle(DragEvent e){
//                    e.acceptTransferModes(TransferMode.ANY);
//                    System.out.println("dropDetected");
//                }
//            });
//        }




        gird.setAlignment(Pos.CENTER);
        gird.setGridLinesVisible(true);

        gird.setBackground(background.setBackground(boardImage));


        mainStage.setScene(sc);
        mainStage.show();

    }
}
