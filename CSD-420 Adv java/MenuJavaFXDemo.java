//pj ellis - module 7 - JavaFX Menu Demo

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuJavaFXDemo extends Application {
    
    @Override
    public void start(Stage demo) {                
        //create a menubar
        MenuBar mBar = new MenuBar();
        
        //create a menu
        Menu FileTab = new Menu("File");
        Menu EditTab = new Menu("Edit");
        
        //create menu items
        MenuItem f1 = new MenuItem("New");
        MenuItem f2 = new MenuItem("Save");
        MenuItem e1 = new MenuItem("Cut");
        MenuItem e2 = new MenuItem("Copy");
        MenuItem e3 = new MenuItem("Paste");
        
        //add menu item to menu
        FileTab.getItems().addAll(f1, f2);
        EditTab.getItems().addAll(e1, e2, e3);
        
        //add menus to menubar
        mBar.getMenus().addAll(FileTab, EditTab);
        
        //Place to put menubar
        BorderPane menuHolder = new BorderPane();
        menuHolder.setTop(mBar);
        
        //add to scene
        Scene scene = new Scene(menuHolder, 500, 300);
        demo.setTitle("Java FX Menu Demo");
        demo.setScene(scene);
        demo.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }    
}






