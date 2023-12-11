/*****************************************************************************
 * MIT License
 * Copyright (c) 2023 CoolDuderCoder
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *****************************************************************************/

package org.MathJUtil;

import java.util.Random;

/**
 * A class that when implemented will give you a number between 0 to 100 based on chances
 * @author CoolDuderCoder
 */
public class Range
{
	private int chance;
	
	/**
	 * Initiliazing Range
	 * @param chancePercentage
	 */
	public Range(int chancePercentage)
	{
		this.chance = -(chancePercentage / 100);
	}
	
	/**
	 * Calculates the random
	 * @param r1
	 * @return random of the value
	 */
	public static int getRand(Range r1)
	{
		Random rand = new Random();
		
		return (int)MathUtil.clamp((rand.nextInt(100) + rand.nextInt(100 - (r1.chance / 100))), 0, 100);
	}
	
	/**
	 * Gives the rand chance in a boolean
	 * @param r1
	 * @return rand chance bool
	 */
	public static boolean getRandChance(Range r1)
	{
		return getRand(r1) > r1.getChance();
	}
	
	/**
	 * Gives the chance
	 * @return chance
	 */
	public int getChance()
	{
		return chance;
	}
	
	/**
	 * Sets the chance
	 * @param chance
	 */
	public void setChance(int chance)
	{
		this.chance = chance;
	}
}
