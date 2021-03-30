/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs3365_project1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author hoefs
 */
public class BlackjackGame extends Application {
    FlowPane player1cards = new FlowPane(Orientation.HORIZONTAL);
    
    FlowPane player2cards = new FlowPane(Orientation.HORIZONTAL);
    FlowPane player3cards = new FlowPane(Orientation.HORIZONTAL);
    FlowPane player4cards = new FlowPane(Orientation.HORIZONTAL);
    FlowPane player5cards = new FlowPane(Orientation.HORIZONTAL);
    FlowPane player6cards = new FlowPane(Orientation.HORIZONTAL);
    FlowPane player7cards = new FlowPane(Orientation.HORIZONTAL);
    FlowPane dealerCards = new FlowPane(Orientation.HORIZONTAL);
    Label totalLabel = new Label();
    Label totalLabelDealer = new Label();
    Label player1points = new Label();
    Label player2points = new Label();
    Label player3points = new Label();
    Label player4points = new Label();
    Label player5points = new Label();
    Label player6points = new Label();
    Label player7points = new Label();
    Label dealerLbl = new Label("Dealer Hand"); 
    Label playerLbl = new Label("Player 1 Hand");
    Label player2Lbl = new Label("Player 2 Hand");
    Label player3Lbl = new Label("Player 3 Hand");
    Label player4Lbl = new Label("Player 4 Hand");
    Label player5Lbl = new Label("Player 5 Hand");
    Label player6Lbl = new Label("Player 6 Hand");
    Label player7Lbl = new Label("Player 7 Hand");
    Label status = new Label("Game");
    Image imageback = new Image("file:C:\\Users\\hoefs\\Documents\\CS3365_Project_\\CS3365_Project1\\src\\cs3365_project1\\cards\\table.png");
    TextField playerCountText = new TextField();
    int playerCount = 0;
    int player = 0;
    Hand[] playerHand;
    Deck deck;
    Hand dealerHand;
    int points = 0;
    int startingCardsDisplayed = 0;
    int dealerCardsDisplayed = 0;
    int playerCardsInd = 0;
    int dealerCardsInd = 0;
    int displayCardInd = 0;
    int firstDraw = 1;
    int prevPlayer=0;
    Label [] playerLabels = {playerLbl,player2Lbl,player3Lbl,player4Lbl,player5Lbl,player6Lbl,player7Lbl};

    Label [] playerPointsLabels = {player1points,player2points,player3points,player4points,player5points,player6points,player7points};
    //         Update all text colors and fonts
    @Override
    public  void start(Stage primaryStage){
        totalLabel.setFont(new Font("Arial", 24));
        totalLabel.setTextFill(Color.web("#FFF"));
        playerCountText.setText("Enter number of players then press Start!");
        totalLabelDealer.setFont(new Font("Arial", 24));
        totalLabelDealer.setTextFill(Color.web("#FFF")); 
        
        status.setTextFill(Color.web("#FFF")); 
        status.setFont(new Font("Arial", 24)); 
        
        dealerLbl.setTextFill(Color.web("#FFF")); 
        dealerLbl.setFont(new Font("Arial", 24)); 
        
        playerLbl.setTextFill(Color.web("#FFF")); 
        playerLbl.setFont(new Font("Arial", 24));
        
        player2Lbl.setTextFill(Color.web("#FFF")); 
        player2Lbl.setFont(new Font("Arial", 24));
        player3Lbl.setTextFill(Color.web("#FFF")); 
        player3Lbl.setFont(new Font("Arial", 24));
        player4Lbl.setTextFill(Color.web("#FFF")); 
        player4Lbl.setFont(new Font("Arial", 24));
        player5Lbl.setTextFill(Color.web("#FFF")); 
        player5Lbl.setFont(new Font("Arial", 24));
        player6Lbl.setTextFill(Color.web("#FFF")); 
        player6Lbl.setFont(new Font("Arial", 24));
        player7Lbl.setTextFill(Color.web("#FFF")); 
        player7Lbl.setFont(new Font("Arial", 24));
        
          player1points.setTextFill(Color.web("#FFF")); 
        player1points.setFont(new Font("Arial", 24));
         player2points.setTextFill(Color.web("#FFF")); 
        player2points.setFont(new Font("Arial", 24));
        player3points.setTextFill(Color.web("#FFF")); 
        player3points.setFont(new Font("Arial", 24));
        player4points.setTextFill(Color.web("#FFF")); 
        player4points.setFont(new Font("Arial", 24));
        player5points.setTextFill(Color.web("#FFF")); 
        player5points.setFont(new Font("Arial", 24));
        player6points.setTextFill(Color.web("#FFF")); 
        player6points.setFont(new Font("Arial", 24));
        player7points.setTextFill(Color.web("#FFF")); 
        player7points.setFont(new Font("Arial", 24));
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        
        Button drawbtn = new Button();
        
        drawbtn.setText("Hit");
        Button startButton = new Button();
        startButton.setText("START GAME");
        
        Button standbtn = new Button();
        standbtn.setText("Stand");
        
        
        
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(4, 4, 4, 4));
        grid.setHgap(6);
        grid.setVgap(6); 
        grid.setGridLinesVisible(true);
        grid.add(playerCountText, 6, 0);
        grid.add(startButton,7,0);
        grid.add(dealerCards, 3, 1, 2, 2); 
        dealerCards.setPrefWrapLength(2.0);
       
        grid.add(dealerLbl, 3, 0); //changed
        grid.add(totalLabelDealer, 4, 0); 
        
        
        // padding
        Pane p = new Pane(); 
        p.setPrefSize(0, 100); 
        grid.add(p, 0, 4); 
        
        grid.add(player1cards, 0, 3, 1, 2); 
        player1cards.setPrefWrapLength(2.0);
        grid.add(playerLbl, 0, 5); // good
        grid.add(player1points, 0, 6);
        grid.add(player2cards,1,3,1,2);
         player2cards.setPrefWrapLength(2.0);
        grid.add(player2Lbl, 1, 5);
        grid.add(player2points, 1, 6);
        grid.add(player3cards,2,3,1,2);
         player3cards.setPrefWrapLength(2.0);
        grid.add(player3Lbl,2,5);
        grid.add(player3points, 2, 6);
        grid.add(player4cards, 3, 3,1,2);
         player4cards.setPrefWrapLength(2.0);
        grid.add(player4points, 3, 6);
        grid.add(player4Lbl, 3, 5);
        grid.add(player5cards,4,3,1,2);
        player5cards.setPrefWrapLength(2.0);
        grid.add(player5Lbl, 4, 5);
        grid.add(player5points, 4, 6);
        
        grid.add(player6cards,5,3,1,2);
        player6cards.setPrefWrapLength(2.0);
        grid.add(player6Lbl, 5, 5);
        grid.add(player6points, 5, 6);
        
        grid.add(player7cards,6,3,1,2);
        player7cards.setPrefWrapLength(2.0);
        grid.add(player7Lbl, 6, 5);
        grid.add(player7points, 6, 6);
        
        //grid.add(totalLabel, 1, 4, 2, 1);  
        grid.add(drawbtn,3,9);
        grid.add(standbtn,4,9);
        
        grid.add(status, 0, 0 );
        grid.setBackground(background);
        
        
        Scene scene = new Scene(grid, 1600, 900);
        
        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        startButton.setOnAction((e) -> {
            playerCount = Integer.parseInt(playerCountText.getText());
            System.out.println(playerCount);
            deck = new Deck();
            playerHand = new Hand[playerCount];
            for(int player = 0; player < playerCount; player++)
                playerHand[player] = new Hand(deck);
            
            // display cards
            for(int i = 0;i<playerCount;i++){
            int playerInd = i;
            playerHand[i].getHand().forEach((card) -> {
                    final FlowPane[] fpListF = {player1cards,player2cards,player3cards,player4cards,player5cards,player6cards,player7cards};
                    int playerIn = 0;
                    
                    
                    System.out.print(card.getValue() + card.getSuit() + "\n");
                    String fName = card.getFilename(card.getSuit(),card.getValue()).toLowerCase();
                    ImageView img = new ImageView(fName);
                   
                    fpListF[playerInd].getChildren().add(img);
                   
                    
                   startingCardsDisplayed = 1;
                    
                    
                });
            playerPointsLabels[i].setText(Integer.toString(playerHand[i].getTotalPoints()));
           
            }
        //give dealer a hand
         dealerHand = new Hand(deck);
         
        //start game
        //player turns
           
        });
        
        

        drawbtn.setOnAction((e) -> {
            
            if(player <= playerCount){
//                status.setText("\nPlayer " + (player + 1) + "'s turn:\n");
            }
            if(prevPlayer != player){
                displayCardInd = 0;
            }
            
            
            
                
                
                playerHand[player].hit(deck);
                points = playerHand[player].getTotalPoints();
                playerPointsLabels[player].setText("Points: " + Integer.toString(points));

                playerHand[player].getHand().forEach((card) -> {
                    
                    final FlowPane[] fpListF = {player1cards,player2cards,player3cards,player4cards,player5cards,player6cards,player7cards};
                    
                    System.out.print(card.getValue() + " " + card.getSuit() + "\n");
                    String fName = card.getFilename(card.getSuit(),card.getValue()).toLowerCase();
                    ImageView img = new ImageView(fName);
                    if(playerCardsInd >(1 + displayCardInd) && startingCardsDisplayed == 1 ){
                        fpListF[player].getChildren().add(img);
                    }
                    
                    
                    
                    if(playerCardsInd > 1){
                          displayCardInd++;
                    }
                  playerCardsInd++;
                });
                prevPlayer = player;
                if(firstDraw == 1){
                    displayCardInd++;
                    firstDraw = 0;
                }else
                    displayCardInd++;
                playerCardsInd = 0;
               totalLabel.setText("Total points: " + points);

                if(points < 22){
                    System.out.print("Make a selection:\n[1] Stay\n[2] Hit\n");
                    
                }else{
                    playerLabels[player].setText("Player " + (player + 1) + " bust!\n");
                    playerHand[player].setBust(true);
                    player++;
                    playerLabels[player].setText("\nPlayer " + (player + 1) + "'s turn:\n");
                    
                }
            
        });
        
        standbtn.setOnAction((e) -> {
             System.out.println("Stand, player " + player);
            player++;
            if(player <playerCount){
                playerLabels[player].setText("\nPlayer " + (player + 1) + "'s turn:\n");
            }
            
           
            if(player > playerCount - 1){
                dealerLbl.setText("Dealer's Turn:");
                System.out.println("Dealer's Turn:");
        int hit = 0;
        do{
            
            if(hit == 1)
                dealerHand.hit(deck);
            points = dealerHand.getTotalPoints();
            totalLabelDealer.setText("Points: " + Integer.toString(points));
            
            dealerHand.getHand().forEach((card) -> {
                
                
                System.out.print(card.getValue() + " " + card.getSuit() + "\n");
                String fName = card.getFilename(card.getSuit(),card.getValue()).toLowerCase();
                ImageView img = new ImageView(fName);
                if(dealerCardsDisplayed == 1 && dealerCardsInd > 1){
                    dealerCards.getChildren().add(img);
                }
                else if(dealerCardsDisplayed == 0){
                    dealerCards.getChildren().add(img);
                }
                dealerCardsInd++;
               
                
            });
            dealerCardsInd = 0;
            dealerCardsDisplayed = 1;
            System.out.println("Total points: " + points);

            if(points > 21){
                dealerLbl.setText("Dealer bust!\n");
                dealerHand.setBust(true);
                hit = 0;
            }else if(points > 16)
                hit = 0;
            else
                hit = 1;
        }while(hit == 1);
        
        // Calculate winner
        boolean dealerWins = true;
        char []winners = new char[playerCount];//winners array may be useful later; if not, just delete it
        System.out.print("\nWinner(s): \n");
        for(int player = 0; player < playerCount; player++){
            //player beat the dealer
            if(!playerHand[player].getBust() && ((playerHand[player].getTotalPoints() > dealerHand.getTotalPoints()) || dealerHand.getBust())){
                status.setText("Player " + (player + 1) + "Wins!\n");
                winners[player] = 'W';
                dealerWins = false;
            //player tied with the dealer
            }else if(!playerHand[player].getBust() && ((playerHand[player].getTotalPoints() == dealerHand.getTotalPoints()) || dealerHand.getBust())){
                status.setText("Player " + (player + 1) + "! (Tie)\n");
                winners[player] = 'T';
                dealerWins = false;
            //player loses
            }else
                winners[player] = 'L';
        }
        if(dealerWins && dealerHand.getBust() == false)
            status.setText("Dealer Wins!\n");
        
        
            }
        });

}}
