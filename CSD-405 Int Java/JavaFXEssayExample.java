/* Pj Ellis - Module 7 - JavaFX Essay Code
 *
 * Research the web for JavaFX topics from the list below. Provide examples on 
 * the topics you discuss along with a file including documentation in the actual 
 * code. Include a link to the site(s) you are referencing in your paper. This 
 * paper is to be a 700-word paper (excluding your references) on two of the 
 * following Layout topics. This paper will automatically be submitted to 
 * SafeAssign for an originality/plagiarism review. 
 * 
 * Note: Your code is not to be in your paper, it is to be a separate file for 
 * execution testing.
 * 
 * JavaFX Hbox
 * JavaFX GridPane
 * 
 * (also show how to use a JavaFX BorderPane to display both classes in one window)
 */

//Importing everything needed to create my new window
import javafx.scene.paint.Color;
import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage; 

//Public Class
public class JavaFXEssayExample extends Application {
    
    @Override
    public void start (Stage stage) {
        
        //create a BorderPane in order to display my two examples in one window
        BorderPane example = new BorderPane();
        
        //setting my two examples into sections of my BorderPane
        example.setTop(addHBox());
        example.setCenter(addGridPane());

        //Creating a scene object
        Scene scene = new Scene(example);
        
        //Setting title to the Stage
        stage.setTitle("JavaFX Essay Example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
        
    }//End of start
   
    //Creating all components of GridPane
    public GridPane addGridPane () {
        
        //creating labels Username and Password
        Text user = new Text("Username");
        Text pWord = new Text("Password"); 
	  
        //Creating Text Fields for email and password        
        TextField userField = new TextField();
        TextField pWordField = new TextField();  
       
        //Creating Buttons 
        Button submit = new Button("Submit"); 
        Button clear = new Button("Clear");  
      
        //Creating a Grid Pane 
        GridPane userInput = new GridPane();    
      
        //Setting size for the pane  
        userInput.setMinSize(400, 150); 
       
        //Setting the padding  
        userInput.setPadding(new Insets(10, 10, 10, 10)); 
      
        //Setting the vertical and horizontal gaps between the columns 
        userInput.setVgap(5); 
        userInput.setHgap(5);       
      
        //Setting the Grid alignment 
        userInput.setAlignment(Pos.CENTER); 
       
        //Adding and arranging all the children in the grid 
        userInput.add(user, 0, 0); 
        userInput.add(userField, 1, 0); 
        userInput.add(pWord, 0, 1);       
        userInput.add(pWordField, 1, 1); 
        userInput.add(submit, 0, 2); 
        userInput.add(clear, 1, 2);
        
        //return GridPane
        return userInput;
        
    }//End of addGridPane 
   
    public HBox addHBox() {
        //creating all components of myHbox
       
        //create buttons and their size
        Button signIn = new Button("Sign-In");
        signIn.setPrefSize(100, 20);
       
        Button reg = new Button("Register");
        reg.setPrefSize(100, 20);
        
        //creating a Text object for between buttons       
        Text text = new Text("OR");
       
        //setting color to the text
        text.setFill(Color.WHITE);
       
        //setting font of the text
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));       
       
        //create a HBox
        HBox signReg = new HBox();
       
        //Set padding around each component
        signReg.setPadding(new Insets(15, 12, 15, 12));
       
        //Set Spacing around the components
        signReg.setSpacing(10);
       
        //Give this area a background color to show the difference in the window
        signReg.setStyle("-fx-background-color: #336699;");
       
        //set the alignment to be in center
        signReg.setAlignment(Pos.CENTER);
       
        //add all the children to the HBox
        signReg.getChildren().addAll(signIn,text, reg);
       
        //return HBox
        return signReg;
    
    }//End of addHBox
   
    public static void main(String args[]){ 
        launch(args); 
    }//End of Main
   
}//End of Class