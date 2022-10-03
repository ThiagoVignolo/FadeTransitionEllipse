/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package fadetransition;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Thiago Vignolo
 */
public class FadeTransitionEllipse extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Ellipse elipse = new Ellipse(70, 50);
        elipse.setFill(Color.RED);
        
        
        FadeTransition ft = new FadeTransition(Duration.millis(3000), elipse);
        
        
        ft.setFromValue(1.0);
        ft.setToValue(0.3);
        ft.setCycleCount(4);
        ft.setAutoReverse(true);

        ft.play();
        
        StackPane root = new StackPane();
        root.getChildren().add(elipse);
        
        root.setOnMousePressed(event -> {
            ft.pause();
        });

        root.setOnMouseReleased(event -> {
            ft.play();
        });
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("FadeTrancition");
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
