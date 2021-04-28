/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs3365_project1;

import java.util.LinkedList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hoefs
 */
public class HandTest {
    
    public HandTest() {
    }
    


    /**
     * Test of getBust method, of class Hand.
     */
    @Test
    public void testGetBust() {
        System.out.println("getBust");
        Deck deck = new Deck();
        Hand instance = new Hand(deck);
        boolean expResult = false;
        boolean result = instance.getBust();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setBust method, of class Hand.
     */
   

    /**
     * Test of getHand method, of class Hand.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Deck deck = new Deck();
        Hand instance = new Hand(deck);
        int expResult = 2;
        int result = instance.getHand().size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getTotalPoints method, of class Hand.
     */
//    @Test
//    public void testGetTotalPoints() {
//        System.out.println("getTotalPoints");
//        Hand instance = null;
//        int expResult = 0;
//        int result = instance.getTotalPoints();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of hit method, of class Hand.
//     */
//    @Test
//    public void testHit() {
//        System.out.println("hit");
//        Deck deck = null;
//        Hand instance = null;
//        instance.hit(deck);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class Hand.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Hand.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
