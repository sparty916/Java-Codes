/* Pj Ellis - Module 8 - Display Cards
 *
 * Write a program that displays four images randomly selected from a deck of 52
 * cards. The attached zip file has card files titled 1.png, 2.png, 3.png, 4.png
 *  …, 52.png. For this application:
 * 1 - Store the images in a “cards” sub directory.
 * 2 - Using these cards, randomly select four cards for display.
 * 3 - You may use a different set of images you either have or decide to make
 */

//imports I will need
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//Start of public class
public class CardDisplay extends Application {
    
    //creating array to hold card numbers for use in my methods
    Image[] cards;
    
    //creating array for the 4 picked cards to dispaly
    int[] pickACard;
    
    
    private void setCards() {
        //Set up array and fill with cards and image location
        cards = new Image[52];
        int fileName = 1;
        for (int i = 0; i < cards.length; i++) {
            Image card = new Image("cards/" + fileName + ".png");
            cards[i] = card;
            fileName++;
        }//end of for loop

    }//end of setCards
    
    private void pick4Cards() {
        //creating an array to hold the 4 cards picked
        pickACard = new int[4];
        int card = -1;
        
        /* setting all the array values to all -1 so that when i compare random 
         * numbers and i can get 0 and i can assign it to that array, otherwise 
         * it will never assign 0, and we will never get the Ace of spades chosen
        */
        for (int i = 0; i <pickACard.length; i++) {
            pickACard[i] = -1;
        }
        
        //for loop to assign 4 random numbers and make sure of no duplicates
        for (int i = 0; i <pickACard.length; i++) {
            do {
            card = (int) (Math.random() * 52);
            }
            while (card == pickACard[0] || card == pickACard[1] || card == pickACard[2] || card == pickACard[3]);
            
            pickACard[i] = card;
        }
        
    }

    @Override
    public void start(Stage stage) {
        //setting the cards using private method
        setCards();
        
        //pick 4 cards using private method
        pick4Cards();
        
        //Creating a BorderPane to display output
        BorderPane cardTable = new BorderPane();
        
        //create text for BorderPane bottom
        Text dealer = new Text("THE 4 CARDS DRAWN");
        
        //setting color to the text
        dealer.setFill(Color.DARKBLUE);
        
        //set strokewidth
        dealer.setStrokeWidth(1.5);
        
        //set stroke color
        dealer.setStroke(Color.WHITE);
               
        //set Font, Styles, and Size
        dealer.setFont(Font.font("Calibri", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 45));
        
        //set text placement by putting in an HBox
        HBox dealerSaid = new HBox();        
        dealerSaid.getChildren().add(dealer);        
        dealerSaid.setAlignment(Pos.CENTER);
                
        //set HBox(text) to bottom of BorderPane
        cardTable.setBottom(dealerSaid);
               
        //creating HBox to display cards
        HBox cardsPicked = new HBox();
        
        //setting HBox padding and spacing
        cardsPicked.setPadding(new Insets(10, 10, 10, 10));
        cardsPicked.setSpacing(10);

        //creating imageview components while assinging the image of card picked
        ImageView card1 = new ImageView(cards[pickACard[0]]);
        
        //setting the output size
        card1.setPreserveRatio(true);
        card1.setFitHeight(150);

        //repeat for each card
        ImageView card2 = new ImageView(cards[pickACard[1]]);
        card2.setPreserveRatio(true);
        card2.setFitHeight(150);

        ImageView card3 = new ImageView(cards[pickACard[2]]);
        card3.setPreserveRatio(true);
        card3.setFitHeight(150);
        
        ImageView card4 = new ImageView(cards[pickACard[3]]);
        card4.setPreserveRatio(true);
        card4.setFitHeight(150);

        //adding the images to my HBox
        cardsPicked.getChildren().addAll(card1, card2, card3, card4);
        
        //set position
        cardsPicked.setAlignment(Pos.CENTER);
        
        //set 4 cards to BorderPane
        cardTable.setCenter(cardsPicked);

        //Creating my scene object
        Scene scene = new Scene(cardTable, 500, 225, Color.DODGERBLUE);
        
        //Setting Title to my stage
        stage.setTitle("Display 4 Random Cards");
        
        //Adding scene to the stage
        stage.setScene(scene);
        
        //Display the stage
        stage.show();

    }//end of start

    public static void main(String args[]){ 
        launch(args); 
    }//End of Main
    
}//End of Class
