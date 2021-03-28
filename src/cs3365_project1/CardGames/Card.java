/**
*CS 3365 001
*Cole Trammell
*
 */
package CardGames;
/**
 *
 * @author Cole Trammell
 * Creates a card object with attributes color, exercise, isSpecial, and rank
 */
public class Card {

    /**
     *The value of the card
     */
    private final String value;

    /**
     *The suit of the card
     */
    private final String suit;

    /**
    *The points the card is worth
    */
    private int points;

    /**
    *whether the card is hidden from player view or not
    */
    private boolean hidden;
    
    /**
     *class constructor
     * @param value: The value of the card
     * @param suit: The suit of the card
     * @param points: The points the card is worth
    **/
    public Card(String value, String suit, int points, boolean hidden){
        this.value = value;
        this.suit = suit;
        this.points = points;
        this.hidden = hidden;
    }//end of Card constructor
    
    /**
     *
     * @return value
     */
    public String getValue(){
        return value;
    }
    
    /**
     *
     * @return suit
     */
    public String getSuit(){
        return suit;
    }
    
    /**
     *
     * @return points
     */
    public int getPoints(){
        return points;
    }

    /**
    *
    * @return hidden
    */
    public boolean getHidden(){
      return hidden;
    }

    /**
    *
    *@param hidden
    */
    public void setHidden(boolean hidden){
      this.hidden = hidden;
    }
    
    /**
    *
    * @param card
    */
    public void setAcePoints(int pts){
      if ("ACE".equals(this.value) && pts <= 10)
        this.points = 11;
  else if("ACE".equals(this.value))
        this.points = 1;
    }

    /**
    *test case for Card class
     * @param args
    **/
    public static void main(String[] args)  
    {  
        Card card = new Card("two","club",2,false); 
        System.out.println(card.value);
        System.out.println(card.suit);
        System.out.println(card.points);
    } //end of main method

    void setAcePoints() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}//end of Card Class