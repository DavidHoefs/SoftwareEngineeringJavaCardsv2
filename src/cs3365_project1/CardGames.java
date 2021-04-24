package CardGames;

import java.util.Scanner;
import java.util.LinkedList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CardGames {
    
    public static void updateScoreboard(String fname, PlayerChips []PC, int count) throws IOException{
        //writes chip count to file per player
        //i.e. line 1 = player 1, line 2 = player 2... etc.
        LinkedList<Integer> tempScores = new LinkedList<>();
        File file = new File(fname);
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        //read values already in file
        String st;
        while((st = br.readLine())!= null)
            tempScores.add(Integer.parseInt(st));
        br.close();
        
        //if new values are higher, replace them
        for(int player = 0; player < count; player++){
            if(tempScores.get(player) < PC[player].getTotalValue())
                tempScores.set(player, PC[player].getTotalValue());
            //System.out.println(tempScores.get(player));
        }
        
        //write to file
        FileWriter writer = new FileWriter(fname);
        writer.write(tempScores.get(0).toString() + '\n' + 
                     tempScores.get(1).toString() + '\n' + 
                     tempScores.get(2).toString() + '\n' + 
                     tempScores.get(3).toString() + '\n' + 
                     tempScores.get(4).toString() + '\n' + 
                     tempScores.get(5).toString() + '\n' + 
                     tempScores.get(6).toString() + '\n');
        writer.close();
    }
    
    public static void blackJack(){//get player count
        int playerCount = 0;
        while(playerCount < 2 || playerCount > 7){
            System.out.print("Enter the number of players [2-7]:\n");
            playerCount = (new Scanner(System.in)).nextInt();
        }
        
        PlayerChips []playerChips = new PlayerChips[playerCount];
        for(int player = 0; player < playerCount; player++)
            playerChips[player] = new PlayerChips();
        
        boolean playAgain = true;
        
        while(playAgain){
            
            //print the amount of chips each player has
            for(int player = 0; player < playerCount; player++)
                System.out.println("Player " + (player + 1) + " chips: " + playerChips[player].getTotalValue());

            //initialize deck and deal hands
            Deck deck = new Deck();
            Hand []playerHand = new Hand[playerCount];
            for(int player = 0; player < playerCount; player++)
                playerHand[player] = new Hand(deck);

            //give dealer a hand
            Hand dealerHand = new Hand(deck);

            //start game
            //player turns
            int points;
            for(int player = 0; player < playerCount; player++)
            {
                //get player's initial hand
                System.out.print("\nPlayer " + (player + 1) + "'s turn:\n");
                int hit = 0;
                
                //get player's bet
                System.out.print("How much would you like to wager?\n");
                Chip chip = new Chip((new Scanner(System.in)).nextInt());
                playerChips[player].addBet(chip);//add chip to player's bet
                
                System.out.println("Current bet: " + playerChips[player].getBetValue());
                
                do{
                    if(hit == 1)
                        playerHand[player].hit(deck);
                    points = playerHand[player].getTotalPoints();

                    playerHand[player].getHand().forEach((card) -> {
                        System.out.print(card.getValue() + " " + card.getSuit() + "\n");
                    });
                    System.out.println("Total points: " + points);

                    if(points < 22){
                        System.out.print("Make a selection:\n[1] Stay\n[2] Hit\n");
                        hit = (new Scanner(System.in)).nextInt() - 1;
                    }else{
                        System.out.print("Player " + (player + 1) + " bust!\n");
                        playerHand[player].setBust(true);
                        hit = 0;
                    }
                }while(hit == 1);
            }

            //dealer's turn
            System.out.print("\nDealer's Turn:\n");
            int hit = 0;
            do{
                if(hit == 1)
                    dealerHand.hit(deck);
                points = dealerHand.getTotalPoints();

                dealerHand.getHand().forEach((card) -> {
                    System.out.print(card.getValue() + " " + card.getSuit() + "\n");
                });
                System.out.println("Total points: " + points);

                if(points > 21){
                    System.out.print("Dealer bust!\n");
                    dealerHand.setBust(true);
                    hit = 0;
                }else if(points > 16)
                    hit = 0;
                else
                    hit = 1;
            }while(hit == 1);

            //calculate winner
            boolean dealerWins = true;
            System.out.print("\nWinner(s): \n");
            for(int player = 0; player < playerCount; player++){
                //System.out.println("Player " + (player + 1) + " bet: " + playerChips[player].getBetValue());
                //player beat the dealer
                if(!playerHand[player].getBust() && ((playerHand[player].getTotalPoints() > dealerHand.getTotalPoints()) || dealerHand.getBust())){
                    System.out.print("Player " + (player + 1) + "!\n");
                    playerChips[player].wonHand();//win moni
                    dealerWins = false;
                //player tied with the dealer
                }else if(!playerHand[player].getBust() && ((playerHand[player].getTotalPoints() == dealerHand.getTotalPoints()) || dealerHand.getBust())){
                    System.out.print("Player " + (player + 1) + "! (Tie)\n");
                    dealerWins = false;
                //player loses
                }else
                    playerChips[player].lostHand();//lose moni
                playerChips[player].resetBet();//reset bet amount
            }
            if(dealerWins)
                System.out.print("Dealer!\n");
            
            //play again?
            System.out.print("Play Again?\n[1] No\n[2] Yes\n");
            playAgain = (((new Scanner(System.in)).nextInt() - 1) == 1);
        }
        
        try{
            updateScoreboard("D:\\Documents - HDD\\NetBeansProjects\\bj\\src\\CardGames\\BlackJackScoreBoard.txt", playerChips, playerCount);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        //ask user to select game
        int gameChoice = 0;
        while(gameChoice < 1 || gameChoice > 2){
            System.out.print("Welcome! Please select a game:\n[1] Blackjack\n[2] Texas Holdem\n");
            gameChoice = (new Scanner(System.in)).nextInt();
        }

        if(gameChoice == 1){
            blackJack();
        }else if(gameChoice == 2){
            System.out.print("Game under development\n");
        }
    } //end of main method
}
