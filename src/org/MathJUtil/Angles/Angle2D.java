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

package org.MathJUtil.Angles;

import org.MathJUtil.Vectors.Vector2f;

/**
 * Implement this MathJUtil class to have a 2D Angle for
 * other classes that use 2D Angles
 * @author CoolDuderCoder
 */
public class Angle2D 
{
	private Vector2f angle;
	
	/**
	 * Creates a blank angle by using {@link #Angle2D(Vector2f)}
	 */
	public Angle2D()
	{
		this(new Vector2f());
	}
	
	/**
	 * Creates a angle set by the user
	 * @param angle
	 */
	public Angle2D(Vector2f angle)
	{
		this.angle = angle;
	}
	
	/**
	 * Creates an angle with both values set to the 1D angle passed in
	 * @param r
	 */
	public Angle2D(Angle r)
	{
		this.angle = new Vector2f(r.getAngle());
	}
	
	/**
	 * Creates an angle with two 1D Angles
	 * @param x
	 * @param y
	 */
	public Angle2D(Angle x, Angle y)
	{
		this.angle = new Vector2f(x.getAngle(), y.getAngle());
	}
	
	/**
	 * gets the angle of the class
	 * @return
	 */
	public Vector2f getAngle()
	{
		return angle;
	}
	
	/**
	 * sets the angle of the class
	 * @param angle
	 */
	public void setAngle(Vector2f angle)
	{
		this.angle = angle;
	}
}
