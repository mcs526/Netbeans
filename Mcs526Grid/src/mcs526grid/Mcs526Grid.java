/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcs526grid;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author madelynpetersohn
 */
public class Mcs526Grid extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        double numRows = 20;
        double numCols = 20;
        double width = 400;
        double height = 400;
        String[] myColors = new String[]{"LemonChiffon", "Teal", "Gold", "Crimson", "Indigo"};
        
        GridPane root = new GridPane();
        Scene scene = new Scene(root, width, height);
        
        for(int i = 0; i < numCols; i++) {
            ColumnConstraints column = new ColumnConstraints();
            column.setPercentWidth((double)100.0/numCols);
            root.getColumnConstraints().add(column);
        }
        
        for(int i = 0; i < numRows; i++) {
            RowConstraints row = new RowConstraints();
            row.setPercentHeight((double)100.0/numRows);
            root.getRowConstraints().add(row);
        }
        
        for(int i=0; i <numRows; i++){
            for(int j=0; j<numCols; j++){
                Random randomColor = new Random();
                int index = randomColor.nextInt(myColors.length);
                Rectangle box = new Rectangle((double) width/numCols + 1.0, (double) height/numRows + 1.0, Color.valueOf(myColors[index]));
                root.add(box, j, i);
            }
        }
        
        primaryStage.setTitle("Grid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
    }
    
}
