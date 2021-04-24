
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CardGames;

import CardGames.Deck;
import CardGames.Card;
import java.util.LinkedList;

/**
 *
 * @author Cole Trammell
 */
public class Hand {
      
    /**
     *linkedList of cards in hand
     */
    private LinkedList<Card> hand = new LinkedList<>();

    /**
    *number of total points in the hand
    */
    private int totalPoints;
    
    private boolean bust;
   
    /**
     *
     * @param deck - The deck you want to deal
     */
    
    public Hand(Deck deck){
        hand.add(deck.hit());
        hand.add(deck.hit());
        this.bust = false;
    }
    
    /**
     *
     */
    private void calculateTotalPoints(){
        totalPoints = 0;
        hand.forEach((card) -> {
            card.setAcePoints(totalPoints);
            totalPoints += card.getPoints();
        });
    }
    
    public boolean getBust(){
        return this.bust;
    }
    
    public void setBust(boolean b){
        this.bust = b;
    }
   
    /**
     *
     *@return hand
     */
    public LinkedList<Card> getHand(){
        return hand;
    }

    /**
     *
     *@return totalPoints
     */
    public int getTotalPoints(){
        calculateTotalPoints();
        return totalPoints;
    }
   
    public void hit(Deck deck){
       hand.add(deck.hit());
    }
   
    /**
     *
     * @param args
     */
    public static void main(String[] args){
       
    }
}
