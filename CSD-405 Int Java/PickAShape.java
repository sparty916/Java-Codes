/* Pj Ellis - Module 11 - JavaFX Shapes and Events
 * Write a program that displays various figures such as a Circle, a Rectangle, 
 * or an Ellipse.
 * Include radio buttons selections for changing the display figure to the one selected.
 * Include a checkbox for filling and clearing the displayed figure with a random color.
 */

//imports
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PickAShape extends Application {
    Rectangle rectangle = new Rectangle(125, 90);
    Circle circle = new Circle(50);
    Ellipse ellipse = new Ellipse(100, 50);
    
    @Override
    public void start(Stage primaryStage) {
        
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(Color.WHITE);

        Text instructions = new Text("SELECT A SHAPE");
        instructions.setFont(Font.font("Arial", 35));
        instructions.setFill(Color.WHITE);

        HBox top = new HBox();
        top.getChildren().add(instructions);
        top.setAlignment(Pos.CENTER);
        top.setStyle("-fx-background-color: darkblue;" + "-fx-border-color: black;");
        
        Text next = new Text("AND THEN FILL IT");
        next.setFont(Font.font("Arial", 35));
        next.setFill(Color.WHITE);
        
        HBox bottom = new HBox();
        bottom.getChildren().add(next);
        bottom.setAlignment(Pos.CENTER);
        bottom.setStyle("-fx-background-color: darkblue;" + "-fx-border-color: black;");
                
        RadioButton cirRB = new RadioButton("Circle");
        RadioButton rectRB = new RadioButton("Rectangle");
        RadioButton ellipRB = new RadioButton("Ellipse");
        CheckBox fillCB = new CheckBox("Fill");

        ToggleGroup options = new ToggleGroup();
        cirRB.setToggleGroup(options);
        rectRB.setToggleGroup(options);
        ellipRB.setToggleGroup(options);
        
        VBox choices = new VBox(25);
        choices.setMinWidth(100);
        choices.getChildren().addAll(cirRB, rectRB, ellipRB);
        choices.setStyle("-fx-background-color: lightgrey;" + "-fx-border-color: black;");
        choices.setPadding(new Insets(10, 10, 10, 10));
        choices.setAlignment(Pos.CENTER);
        
        VBox fillIt = new VBox(25);
        fillIt.setMinWidth(100);
        fillIt.getChildren().add(fillCB);
        fillIt.setStyle("-fx-background-color: lightgrey;" + "-fx-border-color: black;");
        fillIt.setPadding(new Insets(10, 10, 10, 10));
        fillIt.setAlignment(Pos.CENTER);        
        
        StackPane window = new StackPane();        
        window.setStyle("-fx-background-color: grey;" + "-fx-border-color: black;");
        
        BorderPane selection = new BorderPane();
        selection.setTop(top);
        selection.setCenter(window);
        selection.setLeft(choices);
        selection.setRight(fillIt);
        selection.setBottom(bottom);
        
        Scene scene = new Scene(selection, 500, 250);
        primaryStage.setTitle("Pick A Shape and Fill It"); 
        primaryStage.setScene(scene); 
        primaryStage.show();

        cirRB.setOnAction(e -> {
            window.getChildren().clear();
            window.getChildren().add(circle);
            if (fillCB.isSelected()) {
                circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            }
            else {
                circle.setFill(Color.WHITE);
            }
        });

        rectRB.setOnAction(e -> {
            window.getChildren().clear();
            window.getChildren().add(rectangle);
            if (fillCB.isSelected()) {
                rectangle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            }
            else {
                rectangle.setFill(Color.WHITE);
            }
        });
    
        ellipRB.setOnAction(e -> {
            window.getChildren().clear();
            window.getChildren().add(ellipse);
            if (fillCB.isSelected()) {
                ellipse.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            }
            else {
                ellipse.setFill(Color.WHITE);
            }
        });
    
        fillCB.setOnAction(e -> {
            if (fillCB.isSelected()) {
                circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                rectangle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                ellipse.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            }
            else {
                circle.setFill(Color.WHITE); 
                rectangle.setFill(Color.WHITE); 
                ellipse.setFill(Color.WHITE); 
            }
        });        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}