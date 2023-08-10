/*Pj Ellis - Module 10 - JavaFX and SQL
 * Write a program that views and updates fan information stored in a database.
 * Interface is to have 2 buttons to display a record from a User Provided ID input 
 * and update records in database based on changes made in the display.
 * Your application is not to create or delete the table.
*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import java.sql.*;
import javafx.geometry.Insets;

public class DisplayFansDatabase extends Application{
    TextField tfID = new TextField("Please Enter ID");
    TextField tfFName = new TextField();
    TextField tfLName = new TextField();
    TextField tfFavTeam = new TextField();
    Button btDisplay = new Button("Display");
    Button btUpdate = new Button("Update");
    Label lbID = new Label("ID");
    Label lbFName = new Label("First Name");
    Label lbLName = new Label("Last Name");
    Label lbFavTeam = new Label("Favorite Team");
    Label lbStatus = new Label();    
    
    Connection connection;
    Statement statement;
    
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.addRow(0, lbID, tfID);
        grid.addRow(1, lbFName, tfFName);
        grid.addRow(2, lbLName, tfLName);
        grid.addRow(3, lbFavTeam, tfFavTeam);
        
        HBox buttons = new HBox(10);
        buttons.getChildren().addAll(btDisplay, btUpdate);
        buttons.setAlignment(Pos.CENTER);
        
        HBox message = new HBox(10);
        message.getChildren().addAll(lbStatus);
        message.setAlignment(Pos.CENTER);
        
        VBox display = new VBox(10);
        display.getChildren().addAll(message, grid, buttons);
        display.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(display, 350, 225);
        primaryStage.setTitle("Fans Database Display/Update");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        connectToDB();
        
        btDisplay.setOnAction(e -> displayFans());
        btUpdate.setOnAction(e -> updateFans());       
    }
    
    private void connectToDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/databasedb?";
            String user = "student1";
            String password = "pass";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected");
            lbStatus.setText("- Database Connected -");
            
            statement = connection.createStatement();
        }
        catch (Exception ex) {
            lbStatus.setText("- Unable to Connect to Database -");
            ex.printStackTrace();
        }
    }
    
    private void displayFans () {
        String idInput = tfID.getText();
        lbStatus.setText(null);

        try {
            ResultSet results = statement.executeQuery("SELECT * FROM fans "
                    + "WHERE id = '" + idInput + "'");
            if (results.next()) {                
                tfFName.setText(results.getString(2));
                tfLName.setText(results.getString(3));
                tfFavTeam.setText(results.getString(4));
                lbStatus.setText("ID Found");
            } else {
                tfID.setText("Please Enter ID");
                tfFName.setText(null);
                tfLName.setText(null);
                tfFavTeam.setText(null);
                lbStatus.setText("~~ ID NOT FOUND IN DATABASE ~~");
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void updateFans() {
        String idInput = tfID.getText();
        try {
            String query = "UPDATE fans SET firstname = '" + tfFName.getText() 
                    + "', LASTNAME = '" + tfLName.getText() + "', FAVORITETEAM "
                    + "= '" + tfFavTeam.getText() + "' WHERE ID = '" + 
                    idInput + "'";
            int x = statement.executeUpdate(query);
            if (x > 0) {
                statement.executeUpdate("COMMIT");
                lbStatus.setText("- Update Complete - ");
            }
            else
                lbStatus.setText("NO SUCH ID - Cannot Create A New ID");
        }
        catch (Exception ex) {
            lbStatus.setText("Please Enter a VALID ID");
        }
    }
    
    public static void main(String args[]) {
        launch(args);
    }
}
