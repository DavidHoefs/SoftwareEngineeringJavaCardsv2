/*
* Cole Trammell
* CS 3365 001
*
*/
package CardGames;

import java.util.LinkedList;
import java.util.Collections;

/***
 * @Cole Trammell
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
      this.deck.add(new Card("TEN","CLUB",10,true));
      this.deck.add(new Card("TEN","SPADE",10,true));
      this.deck.add(new Card("TEN","DIAMOND",10,true));
      this.deck.add(new Card("TEN","HEART",10,true));
      this.deck.add(new Card("NINE","CLUB",9,true));
      this.deck.add(new Card("NINE","CLUB",9,true));
      this.deck.add(new Card("NINE","CLUB",9,true));
      this.deck.add(new Card("NINE","CLUB",9,true));
      this.deck.add(new Card("EIGHT","CLUB",8,true));
      this.deck.add(new Card("EIGHT","SPADE",8,true));
      this.deck.add(new Card("EIGHT","DIAMOND",8,true));
      this.deck.add(new Card("EIGHT","HEART",8,true));
      this.deck.add(new Card("SEVEN","CLUB",7,true));
      this.deck.add(new Card("SEVEN","SPADE",7,true));
      this.deck.add(new Card("SEVEN","DIAMOND",7,true));
      this.deck.add(new Card("SEVEN","HEART",7,true));
      this.deck.add(new Card("SIX","CLUB",6,true));
      this.deck.add(new Card("SIX","SPADE",6,true));
      this.deck.add(new Card("SIX","DIAMOND",6,true));
      this.deck.add(new Card("SIX","HEART",6,true));
      this.deck.add(new Card("FIVE","CLUB",5,true));
      this.deck.add(new Card("FIVE","SPADE",5,true));
      this.deck.add(new Card("FIVE","DIAMOND",5,true));
      this.deck.add(new Card("FIVE","HEART",5,true));
      this.deck.add(new Card("FOUR","CLUB",4,true));
      this.deck.add(new Card("FOUR","SPADE",4,true));
      this.deck.add(new Card("FOUR","DIAMOND",4,true));
      this.deck.add(new Card("FOUR","HEART",4,true));
      this.deck.add(new Card("THREE","CLUB",3,true));
      this.deck.add(new Card("THREE","SPADE",3,true));
      this.deck.add(new Card("THREE","DIAMOND",3,true));
      this.deck.add(new Card("THREE","HEART",3,true));
      this.deck.add(new Card("TWO","CLUB",2,true));
      this.deck.add(new Card("TWO","SPADE",2,true));
      this.deck.add(new Card("TWO","DIAMOND",2,true));
      this.deck.add(new Card("TWO","HEART",2,true));
      
      //shuffle 3 times
      Collections.shuffle(deck);

      Collections.shuffle(deck);

      Collections.shuffle(deck);
    }
    
    /***
    *   @param  deck
    *   @return card
    */
    public Card hit() {
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