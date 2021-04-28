/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs3365_project1;

import java.util.LinkedList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hoefs
 */
public class DeckTest {
    
    public DeckTest() {
    }
   
    /**
     * Test of hit method, of class Deck.
     */


    /**
     * Test of getDeck method, of class Deck.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Deck instance = new Deck();
        Deck instance2 = new Deck();
        LinkedList<Card> expResult = instance.getDeck();
        LinkedList<Card> result = instance2.getDeck();
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Deck.
     */
    
    
}
