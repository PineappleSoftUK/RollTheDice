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
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author David Ward
 * @version 1.0.0
 */
public class Random {
    
    /**
     * Returns a random number between min and max inclusive.
     * 
     * @param min
     * @param max
     * @return a random number
     */
    public static final int randomInt(int min, int max)
    {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    } 
    
}
