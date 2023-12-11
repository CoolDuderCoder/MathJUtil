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

import org.MathJUtil.MathUtil;

/**
 * A class that represents an angle
 * @author CoolDuderCoder
 */
public class Angle
{
	public static final float RIGHT_ANGLE = MathUtil.toDegrees(90);
	public static final float STRAIGHT_ANGLE = MathUtil.toDegrees(180);
	public static final float FULL_ROTATION = MathUtil.toDegrees(360);
	
	private float angle;
	
	/**
	 * Initiliazing Angle
	 * @param angle
	 */
	public Angle(float angle)
	{
		this.angle = MathUtil.toDegrees(angle);
	}
	
	/**
	 * Angle to String
	 * @param a
	 * @return Angle to String
	 */
	public static String toString(Angle a)
	{
		return a.getAngle() + "°";
	}
	
	/**
	 * Gives angle
	 * @return angle
	 */
	public float getAngle()
	{
		return angle;
	}
	
	/**
	 * Sets angle
	 * @param angle
	 */
	public void setAngle(float angle)
	{
		this.angle = angle;
	}
}
