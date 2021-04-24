
package CardGames;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author Cole Trammell
 * Creates a chip object with attribute value
 **/
public class PlayerChips {

    /**
     *The total value of the chips they player has
     */
    private int totalValue;
    

    /**
    *the chips the player is currently betting
    */
    private LinkedList<Chip> currentBet = new LinkedList<>();


    /**
    *the LinkedList of players chips
    */
    private LinkedList<Chip> playerChips = new LinkedList<>();

    /**
     *class constructor
     *
    **/
    public PlayerChips(){
        //1500
        Chip chip1 = new Chip(500);
        Chip chip2 = new Chip(500);
        Chip chip3 = new Chip(100);
        Chip chip4 = new Chip(100);
        Chip chip5 = new Chip(50);
        Chip chip6 = new Chip(50);
        Chip chip7 = new Chip(20);
        Chip chip8 = new Chip(20);
        Chip chip9 = new Chip(20);
        Chip chip10 = new Chip(20);
        Chip chip11 = new Chip(20);
        Chip chip12 = new Chip(20);
        Chip chip13 = new Chip(10);
        Chip chip14 = new Chip(10);
        Chip chip15 = new Chip(10);
        Chip chip16 = new Chip(10);
        Chip chip17 = new Chip(10);
        Chip chip18 = new Chip(5);
        Chip chip19 = new Chip(5);
        Chip chip20 = new Chip(5);
        Chip chip21 = new Chip(5);
        Chip chip22 = new Chip(5);
        Chip chip23 = new Chip(1);
        Chip chip24 = new Chip(1);
        Chip chip25 = new Chip(1);
        Chip chip26 = new Chip(1);
        Chip chip27 = new Chip(1);

        playerChips.add(chip1);
        playerChips.add(chip2);
        playerChips.add(chip3);
        playerChips.add(chip4);
        playerChips.add(chip5);
        playerChips.add(chip6);
        playerChips.add(chip7);
        playerChips.add(chip8);
        playerChips.add(chip9);
        playerChips.add(chip10);
        playerChips.add(chip11);
        playerChips.add(chip12);
        playerChips.add(chip13);
        playerChips.add(chip14);
        playerChips.add(chip15);
        playerChips.add(chip16);
        playerChips.add(chip17);
        playerChips.add(chip18);
        playerChips.add(chip19);
        playerChips.add(chip20);
        playerChips.add(chip21);
        playerChips.add(chip22);
        playerChips.add(chip23);
        playerChips.add(chip24);
        playerChips.add(chip25);
        playerChips.add(chip26);
        playerChips.add(chip27);
        
    }//end of PlayerChips constructor

   
    /**
     *
     * @return Totalvalue
     */
    public int getTotalValue(){
        totalValue = 0;
        for(int i = 0; i < playerChips.size(); i++)
            totalValue += playerChips.get(i).getValue();
        return totalValue;
    }
    
    public int getBetValue(){
        totalValue = 0;
        for(int i = 0; i <currentBet.size(); i++)
            totalValue += currentBet.get(i).getValue();
        return totalValue;
    }

  /**
  *
  * @param LinkedList of bets
  */
  public void wonHand(){
    for(int i = 0; i < currentBet.size(); i++)
        playerChips.add(currentBet.get(i));
  }
  
  public void lostHand(){
      //look for matching chip and remove it
    for(int i = 0; i < currentBet.size(); i++){
        for(int j = 0; j < playerChips.size(); j++){
            if(currentBet.get(i).getValue() == playerChips.get(j).getValue()){
                playerChips.remove(j);
                break;//remove each chip only once
            }
        }
    }
  }
  
  public void resetBet(){
      currentBet.clear();
  }

  /**
  *
  *@param Chip to add to bets
  */
  public void addBet(Chip chip){
    currentBet.add(chip);
  }

  public LinkedList getcurrentBet(){
    return currentBet;
  }

  public LinkedList getplayerChips(){
    return playerChips;
  }

}