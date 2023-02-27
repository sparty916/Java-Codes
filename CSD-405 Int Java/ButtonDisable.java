/* PJ ellis - Module 10 - Disable Button Demo
 * After User answers question and hits submit, submit button disabled
 * and reveals if answer is correct or incorrect.
*/

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ButtonDisable extends Application {

    @Override
    public void start(Stage stage) {
        
        Label labelfirst = new Label("What is 10 + 10?");
        Label labelresponse = new Label();        

        Button button = new Button("Submit");

        RadioButton radio1, radio2;
        radio1 = new RadioButton("10");
        radio2 = new RadioButton("20");
        
        ToggleGroup question1= new ToggleGroup();
        radio1.setToggleGroup(question1);
        radio2.setToggleGroup(question1);

        //lambda to set action of button to disable after clicking
        button.setOnAction(e -> {
            if (radio2.isSelected()){
                labelresponse.setText("Correct answer");
                button.setDisable(true);
            }
            else {
                labelresponse.setText("Wrong answer");
                button.setDisable(true);
            }
        }
        );

        VBox layout= new VBox(5);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(labelfirst, radio1, radio2, button, labelresponse);
        stage.setTitle("Quiz");
        Scene scene1= new Scene(layout, 200, 150);
        stage.setScene(scene1);        
        stage.show();
}
  
    public static void main(String[] args) {
        launch(args);
    }
    
}