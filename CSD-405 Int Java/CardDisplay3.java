/* Pj Ellis - Module 10 - Display Cards with a refresh button (ALTERNATE VERSION)
 * Using the Assignment Cards Zip File attached above (this is the same zip file
 * used in Module 7), write a program that displays four playing cards. In 
 * addition, your program should meet the following requirements:
 * Below the cards, there will be a refresh button that will then display four 
 * different cards.
 * All cards will be displayed through random selection
*/

//imports
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CardDisplay3 extends Application {
    
    Image[] cards;    
    int[] pickACard = new int[4];
    int pick = 0;
    
    
    private void setCards() {
        //Set up array and fill with cards and image location
        cards = new Image[52];
        int fileName = 1;
        for (int i = 0; i < cards.length; i++) {
            Image card = new Image("cards/" + fileName + ".png");
            cards[i] = card;
            fileName++;
        }

    }

    @Override
    public void start(Stage stage) {
        
        setCards();
        
        VBox cardTable = new VBox(); 
        cardTable.setFillWidth(true);
        
        Text dealer = new Text("THE 4 CARDS DRAWN");        
        dealer.setFill(Color.DARKBLUE);
        dealer.setStrokeWidth(1.5);
        dealer.setStroke(Color.WHITE);
        dealer.setFont(Font.font("Calibri", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 45));
        
        HBox dealersays = new HBox();
        dealersays.getChildren().add(dealer);
        dealersays.setAlignment(Pos. CENTER);
        cardTable.getChildren().add(dealersays);

        HBox cardsPicked = new HBox();
        cardsPicked.setPadding(new Insets(10, 10, 10, 10));
        cardsPicked.setSpacing(10);      


        ImageView card1 = new ImageView(cards[pick4Cards()]);
        card1.setPreserveRatio(true);
        card1.setFitHeight(150);

        ImageView card2 = new ImageView(cards[pick4Cards()]);
        card2.setPreserveRatio(true);
        card2.setFitHeight(150);

        ImageView card3 = new ImageView(cards[pick4Cards()]);
        card3.setPreserveRatio(true);
        card3.setFitHeight(150);
        
        ImageView card4 = new ImageView(cards[pick4Cards()]);
        card4.setPreserveRatio(true);
        card4.setFitHeight(150);
        
        Button shuffleButton = new Button("Shuffle");
        
        shuffleButton.setOnAction((ActionEvent e) -> {
            shuffleCards(cardsPicked);
        });
        HBox shuffleBar = new HBox();
        shuffleBar.getChildren().add(shuffleButton);
        shuffleBar.setAlignment(Pos.CENTER);

        cardsPicked.getChildren().addAll(card1, card2, card3, card4);

        cardTable.getChildren().add(cardsPicked);
        
        cardTable.getChildren().add(shuffleBar);

        Scene scene = new Scene(cardTable);
        stage.setTitle("Display 4 Random Cards");
        stage.setScene(scene);
        stage.show();
    }
    
    private void shuffleCards(HBox cardsPicked){
        pick = 0;
        
        ImageView newCard1 = new ImageView(cards[pick4Cards()]);
        newCard1.setPreserveRatio(true);
        newCard1.setFitHeight(150);
        
        ImageView newCard2 = new ImageView(cards[pick4Cards()]);
        newCard2.setPreserveRatio(true);
        newCard2.setFitHeight(150);

        ImageView newCard3 = new ImageView(cards[pick4Cards()]);
        newCard3.setPreserveRatio(true);
        newCard3.setFitHeight(150);
        
        ImageView newCard4 = new ImageView(cards[pick4Cards()]);
        newCard4.setPreserveRatio(true);
        newCard4.setFitHeight(150);
        
        cardsPicked.getChildren().setAll(newCard1, newCard2, newCard3, newCard4);
    }
    
    int pick4Cards() {        
        int card = -1;        
        do {
            card = (int) (Math.random() * 52);
            }
            while (card == pickACard[0] || card == pickACard[1] || card == pickACard[2] || card == pickACard[3]);
            
            pickACard[pick++] = card;
        
        return card;
    }

    public static void main(String args[]){ 
        launch(args); 
    }//End of Main
    
}//End of Class
