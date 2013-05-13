/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.gamelib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of game method, of class Game.
     */
    @Test
    public void testGame_input_number_5() {
        System.out.println("game: input number 5");
        int number = 5;
        int expResult = 594;
        int result = Game.game(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of game method, of class Game.
     */
    @Test
    public void testGame_input_number_2() {
        System.out.println("game input number 2");
        int number = 2;
        int expResult = 297;
        int result = Game.game(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of game method, of class Game.
     */
    @Test
    public void testGame_input_number_7() {
        System.out.println("game input number 7");
        int number = 7;
        int expResult = 792;
        int result = Game.game(number);
        assertEquals(expResult, result);
    }
}
