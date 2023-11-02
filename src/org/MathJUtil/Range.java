/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil;

import java.util.Random;

public class Range
{
	private int chance;
	
	public Range(int chancePercentage)
	{
		this.chance = -(chancePercentage / 100);
	}
	
	public static int getRand(Range r1)
	{
		Random rand = new Random();
		
		return (int)MathUtil.clamp((rand.nextInt(100) + rand.nextInt(100 - (r1.chance / 100))), 0, 100);
	}
	
	public static boolean getRandChance(Range r1)
	{
		return getRand(r1) > r1.getChance();
	}
	
	public int getChance()
	{
		return chance;
	}
	
	public void setChance(int chance)
	{
		this.chance = chance;
	}
}
