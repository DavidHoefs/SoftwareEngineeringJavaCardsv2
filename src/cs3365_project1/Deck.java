/*
* Cole Trammell
* CS 3365 001
*
*/
package CardGames;

import CardGames.Card;
import java.util.LinkedList;
import java.util.Collections;

/***
 * @Cole 
 * 
 * Handle the main Deck
 */
public class Deck {
    
    
    /***
    * deck - a LinkList type containing the main deck
    */
    private LinkedList<Card> deck = new LinkedList<>();
    
    /***
    *creates deck object
    * no parameters
    */
    public Deck(){
      //adds the cards to the deck
      this.deck.add(new Card("ACE","CLUB",0,true));
      this.deck.add(new Card("ACE","SPADE",0,true));
      this.deck.add(new Card("ACE","DIAMOND",0,true));
      this.deck.add(new Card("ACE","HEART",0,true));
      this.deck.add(new Card("KING","CLUB",10,true));
      this.deck.add(new Card("KING","SPADE",10,true));
      this.deck.add(new Card("KING","DIAMOND",10,true));
      this.deck.add(new Card("KING","HEART",10,true));
      this.deck.add(new Card("QUEEN","CLUB",10,true));
      this.deck.add(new Card("QUEEN","SPADE",10,true));
      this.deck.add(new Card("QUEEN","DIAMOND",10,true));
      this.deck.add(new Card("QUEEN","HEART",10,true));
      this.deck.add(new Card("JACK","CLUB",10,true));
      this.deck.add(new Card("JACK","SPADE",10,true));
      this.deck.add(new Card("JACK","DIAMOND",10,true));
      this.deck.add(new Card("JACK","HEART",10,true));
      this.deck.add(new Card("10","CLUB",10,true));
      this.deck.add(new Card("10","SPADE",10,true));
      this.deck.add(new Card("10","DIAMOND",10,true));
      this.deck.add(new Card("10","HEART",10,true));
      this.deck.add(new Card("9","CLUB",9,true));
      this.deck.add(new Card("9","CLUB",9,true));
      this.deck.add(new Card("9","CLUB",9,true));
      this.deck.add(new Card("9","CLUB",9,true));
      this.deck.add(new Card("8","CLUB",8,true));
      this.deck.add(new Card("8","SPADE",8,true));
      this.deck.add(new Card("8","DIAMOND",8,true));
      this.deck.add(new Card("8","HEART",8,true));
      this.deck.add(new Card("7","CLUB",7,true));
      this.deck.add(new Card("7","SPADE",7,true));
      this.deck.add(new Card("7","DIAMOND",7,true));
      this.deck.add(new Card("7","HEART",7,true));
      this.deck.add(new Card("6","CLUB",6,true));
      this.deck.add(new Card("6","SPADE",6,true));
      this.deck.add(new Card("6","DIAMOND",6,true));
      this.deck.add(new Card("6","HEART",6,true));
      this.deck.add(new Card("5","CLUB",5,true));
      this.deck.add(new Card("5","SPADE",5,true));
      this.deck.add(new Card("5","DIAMOND",5,true));
      this.deck.add(new Card("5","HEART",5,true));
      this.deck.add(new Card("4","CLUB",4,true));
      this.deck.add(new Card("4","SPADE",4,true));
      this.deck.add(new Card("4","DIAMOND",4,true));
      this.deck.add(new Card("4","HEART",4,true));
      this.deck.add(new Card("3","CLUB",3,true));
      this.deck.add(new Card("3","SPADE",3,true));
      this.deck.add(new Card("3","DIAMOND",3,true));
      this.deck.add(new Card("3","HEART",3,true));
      this.deck.add(new Card("2","CLUB",2,true));
      this.deck.add(new Card("2","SPADE",2,true));
      this.deck.add(new Card("2","DIAMOND",2,true));
      this.deck.add(new Card("2","HEART",2,true));
      
      //shuffle 3 times
      Collections.shuffle(deck);

      Collections.shuffle(deck);

      Collections.shuffle(deck);
    }
    
    /***
    *   @param  deck
    *   @return card
    */
    public  Card hit() {
      Card card = deck.pop();
      return card;
    }
    
    /***
    *   @return deck
    */
    public LinkedList<Card> getDeck() {
      return deck;
    }    
    
    /***
     * Test cases for Deck
     * @param args - arguments passed from command line
     */
    public static void main(String[] args) {
       
    } // end of main method
} // end of class