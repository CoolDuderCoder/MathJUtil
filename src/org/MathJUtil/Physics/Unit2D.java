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

import org.MathJUtil.Vectors.Vector2f;

/**
 * A 2D Unit class
 * @author CoolDuderCoder
 */
public class Unit2D 
{
	private Vector2f units;
	
	/**
	 * Initializing Unit2D
	 * @param units
	 */
	public Unit2D(Vector2f units)
	{
		this.units = units;
	}
	
	/**
	 * Initializing Unit2D
	 * @param x
	 * @param y
	 */
	public Unit2D(float x, float y)
	{
		this(new Vector2f(x, y));
	}
	
	/**
	 * @return units
	 */
	public Vector2f getUnits()
	{
		return units;
	}
	
	/**
	 * Sets units
	 * @param units
	 */
	public void setUnits(Vector2f units)
	{
		this.units = units;
	}
}
