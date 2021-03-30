

package cs3365_project1;

import java.util.Scanner;

/**
 *

 */
public class CardGames {
    
    public static void blackJack(){//get player count
        int playerCount = 0;
        while(playerCount < 2 || playerCount > 7){
            System.out.print("Enter the number of players [2-7]:\n");
            playerCount = (new Scanner(System.in)).nextInt();
        }

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
        char []winners = new char[playerCount];//winners array may be useful later; if not, just delete it
        System.out.print("\nWinner(s): \n");
        for(int player = 0; player < playerCount; player++){
            //player beat the dealer
            if(!playerHand[player].getBust() && ((playerHand[player].getTotalPoints() > dealerHand.getTotalPoints()) || dealerHand.getBust())){
                System.out.print("Player " + (player + 1) + "!\n");
                winners[player] = 'W';
                dealerWins = false;
            //player tied with the dealer
            }else if(!playerHand[player].getBust() && ((playerHand[player].getTotalPoints() == dealerHand.getTotalPoints()) || dealerHand.getBust())){
                System.out.print("Player " + (player + 1) + "! (Tie)\n");
                winners[player] = 'T';
                dealerWins = false;
            //player loses
            }else
                winners[player] = 'L';
        }
        if(dealerWins)
            System.out.print("Dealer!\n");
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
