/*
 * Copyright (C) 2018 Pineapple Soft
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package dicecore;

/**
 * A dice object holds a integer between 1 and 6 which can be 
 * changed to a new random number.
 * 
 * @author David Ward
 * @version 1.0.0
 */
public class Dice {
    
    //Instance variables
    private int numberRolled;
    
    //Constructor
    protected Dice()
    {
        this.numberRolled = 0;
    }
    
    /**
     * Setter for numberRolled.
     * 
     * @param aNumber
     */
    private void setNumberRolled(int aNumber)
    {
        this.numberRolled = aNumber;
    }
    
    /**
     * Getter for numberRolled.
     * 
     * @return numberRolled
     */
    public int getNumberRolled()
    {
        return this.numberRolled;
    }
    
    /**
     * The setNumberRolled method will request a random number between 1 and 6.
     * It will then set the numberRolled instance variable to this value.
     */
    protected void rollTheDice()
    {
        this.setNumberRolled(Random.randomInt(1, 6));
    }
}