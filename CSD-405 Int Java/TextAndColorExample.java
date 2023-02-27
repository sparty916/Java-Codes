
/* Pj Ellis - Module 8 - Discussion Post Code
 * 
 * Use of some methods of the Text, Font, and Color classes
 */

//imports
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.Group;


//public class
public class TextAndColorExample extends Application{
    
    @Override
    public void start(Stage stage) {
        
        //create a text object
        Text example = new Text("JavaFX is so much FUN!");
        
        //Set Font, weight, and size
        example.setFont(Font.font("Arial", FontWeight.BOLD, 45));
        
        //Set Stroke Width (Border of Font)
        example.setStrokeWidth(3);
        
        //Set Fill Color
        example.setFill(Color.DEEPPINK);
        
        //Set Stroke Color
        example.setStroke(Color.DARKRED);

        //text can't be set to a scene so we need to add it to something else
        //Scene scene = new Scene(example);//throws an error
        
        //create Hbox to hold and display text
        HBox window = new HBox();
        
        //add the text component to the Hbox
        window.getChildren().add(example);
        
        //set position of HBox
        window.setAlignment(Pos.CENTER);        
        
        //Creating a scene object, set size, and give it a background color
        Scene scene = new Scene(window, 600, 250, Color.LIGHTPINK);
        
        //Setting title to the Stage
        stage.setTitle("Module 8 Example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
        
    }//End of start
    
    //Main Method
    public static void main(String args[]){ 
        launch(args); 
    }//End of Main
    
}//End of Class
