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


package org.MathJUtil.Physics;

import org.MathJUtil.Beta;

/**
 * A circle class
 * @author CoolDuderCoder
 */
@Beta (betaClass=Circle.class)
public class Circle 
{
	public float radius;
	
	public int x;
	public int y;
	
	/**
	 * Initializing Cirlce
	 * @param radius
	 * @param x
	 * @param y
	 */
	public Circle(float radius, int x, int y)
	{
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Checks if a circle overlaps with another circle
	 * @param a
	 * @param b
	 * @return if a circle overlaps with another circle
	 */
	public static boolean overlaps(Circle a, Circle b)
	{
		int xDif = a.x - b.x;
		int yDif = a.y - b.y;
		
		float distanceSquared = xDif * xDif + yDif * yDif;
		
		return distanceSquared < (a.radius + b.radius) * (a.radius + b.radius);
	}
}
