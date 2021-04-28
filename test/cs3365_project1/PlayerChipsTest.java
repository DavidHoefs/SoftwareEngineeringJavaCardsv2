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
public class PlayerChipsTest {
    
    public PlayerChipsTest() {
     
    }
    
  

    /**
     * Test of getTotalValue method, of class PlayerChips.
     */
    @Test
    public void testGetTotalValue() {
        System.out.println("getTotalValue");
        PlayerChips instance = new PlayerChips();
        int expResult = 1500;
        int result = instance.getTotalValue();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getBetValue method, of class PlayerChips.
     */
    @Test
    public void testGetBetValue() {
        System.out.println("getBetValue");
        PlayerChips instance = new PlayerChips();
        int expResult = 0;
        int result = instance.getBetValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

//    /**
//     * Test of wonHand method, of class PlayerChips.
//     */
//    @Test
//    public void testWonHand() {
//        System.out.println("wonHand");
//        PlayerChips instance = new PlayerChips();
//        instance.wonHand();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of lostHand method, of class PlayerChips.
//     */
//    @Test
//    public void testLostHand() {
//        System.out.println("lostHand");
//        PlayerChips instance = new PlayerChips();
//        instance.lostHand();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of resetBet method, of class PlayerChips.
//     */
//    @Test
//    public void testResetBet() {
//        System.out.println("resetBet");
//        PlayerChips instance = new PlayerChips();
//        instance.resetBet();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addBet method, of class PlayerChips.
//     */

//
//    /**
//     * Test of getcurrentBet method, of class PlayerChips.
//     */
//    @Test
//    public void testGetcurrentBet() {
//        System.out.println("getcurrentBet");
//        PlayerChips instance = new PlayerChips();
//        LinkedList expResult = null;
//        LinkedList result = instance.getcurrentBet();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getplayerChips method, of class PlayerChips.
//     */
//    @Test
//    public void testGetplayerChips() {
//        System.out.println("getplayerChips");
//        PlayerChips instance = new PlayerChips();
//        LinkedList expResult = instance.getplayerChips();
//        LinkedList result = instance.getplayerChips();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//       // fail("The test case is a prototype.");
//    }
//    
}
