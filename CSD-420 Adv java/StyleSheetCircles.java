/* pj ellis - Module 07 - CSS Circles - 4/16/23
 * Write a program that displays four circles and uses the style class and ID. 
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class StyleSheetCircles extends Application {    
    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox(5);
        Scene scene = new Scene(hBox, 300, 200);
        scene.getStylesheets().add("mystyle.css");
        
        Pane pane1 = new Pane();
        Pane pane2 = new Pane();
        Pane pane3 = new Pane();
        Pane pane4 = new Pane();
        
        Circle circle1 = new Circle(35, 100, 30);
        Circle circle2 = new Circle(35, 100, 30);
        Circle circle3 = new Circle(35, 100, 30);
        Circle circle4 = new Circle(35, 100, 30);
        
        pane1.getChildren().add(circle1);
        pane1.getStyleClass().add("border");
        circle1.getStyleClass().add("plaincircle");
        
        pane2.getChildren().add(circle2);
        circle2.getStyleClass().add("plaincircle");
        
        pane3.getChildren().add(circle3);
        circle3.getStyleClass().addAll("circleborder", "plaincircle");
        circle3.setId("redcircle");
        
        pane4.getChildren().add(circle4);
        circle4.getStyleClass().addAll("circleborder", "plaincircle");
        circle4.setId("greencircle");
        
        hBox.getChildren().addAll(pane1, pane2, pane3, pane4);
        
        primaryStage.setTitle("Style Sheet Circles");
        primaryStage.setScene(scene);
        primaryStage.show();        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
