/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.gamelib;

/**
 * Implementation of a Game
 *
 * @author Ivan
 */
public class Game {
    
    /**
     * Returns a number
     * 
     * @param number The number
     * @return The game number
     */
    public static int game(int number) {
        int result = 0;
        
        int firstDigit = number;
        int secondDigit = 9;
        int thirdDigit = secondDigit - firstDigit;
        
        result = firstDigit * 100 + secondDigit * 10 + thirdDigit;
        
        return result;
    }
}
