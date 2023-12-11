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

package org.MathJUtil.Vectors;

import org.MathJUtil.MathUtil;
import org.MathJUtil.Angles.Angle;
import org.MathJUtil.Angles.Angle2D;

/**
 * A 2D Float Vector
 * @author CoolDuderCoder
 */
public class Vector2f 
{
	public static final Vector2f POSITIVE_X_AXIS = new Vector2f(1, 0);
	public static final Vector2f NEGATIVE_X_AXIS = new Vector2f(-1, 0);
	public static final Vector2f POSITIVE_Y_AXIS = new Vector2f(0, 1);
	public static final Vector2f NEGATIVE_Y_AXIS = new Vector2f(0, -1);
	
	private float x;
	private float y;
	
	/**
	 * Creates a blank Vector2f
	 */
	public Vector2f()
	{
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Creates Vector2f
	 * @param x
	 * @param y
	 */
	public Vector2f(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Creates Vector2f
	 * @param r
	 */
	public Vector2f(float r)
	{
		this.x = r;
		this.y = r;
	}
	
	/**
	 * Copys the vector passed in
	 * @param r
	 * @return A copy of the vector passed in
	 */
	public static Vector2f copy(Vector2f r)
	{
		return new Vector2f(r.getX(), r.getY());
	}
	
	/**
	 * @param r
	 * @return length of the vector
	 */
	public static float length(Vector2f r)
	{
		return (float)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY());
	}
	
	/**
	 * Calculates the dot product of the two vectors
	 * @param a
	 * @param b
	 * @return dot product of the two vectors
	 */
	public static float dot(Vector2f a, Vector2f b)
	{
		return b.getX() * a.getX() + b.getY() * a.getY();
	}
	
	/**
	 * Calculates the normal of the vector
	 * @param r
	 * @return the normal of the vector
	 */
	public static Vector2f normalize(Vector2f r)
	{
		float length = Vector2f.length(r);
		
		return new Vector2f(r.getX() / length, r.getY() / length);
	}
	
	/**
	 * Calculates the rotation of the vector
	 * @param r
	 * @param angle
	 * @return rotation of the vector
	 */
	public static Vector2f rotate(Vector2f r, Angle angle)
	{
		float rad = MathUtil.toRadians(angle.getAngle());
		float cos = MathUtil.cos(rad);
		float sin = MathUtil.sin(rad);
		
		return new Vector2f((float)(r.getX() * cos - r.getY() * sin), (float)(r.getX() * sin + r.getY() * cos));
	}
	
	/**
	 * Adds the two vectors together
	 * @param a
	 * @param b
	 * @return two vectors added together
	 */
	public static Vector2f add(Vector2f a, Vector2f b)
	{
		return new Vector2f(a.getX() + b.getX(), a.getY() + b.getY());
	}
	
	/**
	 * Adds the vector and the float
	 * @param a
	 * @param r
	 * @return vector and the float added together
	 */
	public static Vector2f add(Vector2f a, float r)
	{
		return new Vector2f(a.getY() + r, a.getY() + r);
	}
	
	/**
	 * Subtracts the two vectors
	 * @param a
	 * @param b
	 * @return two vectors subtracted
	 */
	public static Vector2f sub(Vector2f a, Vector2f b)
	{
		return new Vector2f(a.getX() - b.getX(), a.getY() - b.getY());
	}
	
	/**
	 * Subtracts the vector and the float
	 * @param a
	 * @param r
	 * @return vector and the float subtracted
	 */
	public static Vector2f sub(Vector2f a, float r)
	{
		return new Vector2f(a.getX() - r, a.getY() - r);
	}
	
	/**
	 * Product the two vectors
	 * @param a
	 * @param b
	 * @return two vectors product
	 */
	public static Vector2f mul(Vector2f a, Vector2f b)
	{
		return new Vector2f(a.getX() * b.getX(), a.getY() * b.getY());
	}
	
	/**
	 * Product the vector and the float
	 * @param a
	 * @param b
	 * @return the vector and the float product
	 */
	public static Vector2f mul(Vector2f a, float r)
	{
		return new Vector2f(a.getX() * r, a.getY() * r);
	}
	
	/**
	 * Quotient the two vectors
	 * @param a
	 * @param b
	 * @return two vectors product
	 */
	public static Vector2f div(Vector2f a, Vector2f b)
	{
		return new Vector2f(a.getX() / b.getX(), a.getY() / b.getY());
	}
	
	/**
	 * Quotient the vector and the float
	 * @param a
	 * @param b
	 * @return the vector and the float quotient
	 */
	public static Vector2f div(Vector2f a, float r)
	{
		return new Vector2f(a.getX() / r, a.getY() / r);
	}
	
	/**
	 * Returns the sine of the vector with the amplitude
	 * @param r
	 * @param amplitude
	 * @return the sine of the vector with the amplitude
	 */
	public static Vector2f sin(Vector2f r, float amplitude)
	{
		return new Vector2f(MathUtil.sin(r.getX(), amplitude), MathUtil.sin(r.getY(), amplitude));
	}
	
	/**
	 * Returns the cosine of the vector with the amplitude
	 * @param r
	 * @param amplitude
	 * @return the cosine of the vector with the amplitude
	 */
	public static Vector2f cos(Vector2f r, float amplitude)
	{
		return new Vector2f(MathUtil.cos(r.getX(), amplitude), MathUtil.cos(r.getY(), amplitude));
	}
	
	/**
	 * Returns the vector clamped between the min and the max
	 * @param r
	 * @param min
	 * @param max
	 * @return vector clamped between the min and the max
	 */
	public static Vector2f clamp(Vector2f r, Vector2f min, Vector2f max)
	{
		return new Vector2f(MathUtil.clamp(r.getX(), min.getX(), max.getX()), MathUtil.clamp(r.getY(), min.getY(), max.getY()));
	}
	
	/**
	 * Returns the vector clamped between the min and the max
	 * @param r
	 * @param min
	 * @param max
	 * @return vector clamped between the min and the max
	 */
	public static Vector2f clamp(Vector2f r, float min, float max)
	{
		return new Vector2f(MathUtil.clamp(r.getX(), min, max), MathUtil.clamp(r.getY(), min, max));
	}
	
	/**
	 * Sets the first vector to the second vector
	 * @param a
	 * @param b
	 */
	@Deprecated
	public static void set(Vector2f a, Vector2f b)
	{
		a = b;
		
		return;
	}
	
	/**
	 * Returns the vector a to string
	 * @param r
	 * @return the vector to a string
	 */
	public static String toString(Vector2f r)
	{
		return "(" + r.getX() + " " + r.getY() + ")";
	}
	
	/**
	 * Gets the x position of the vector
	 * @return x position of the vector
	 */
	public float getX()
	{
		return x;
	}
	
	/**
	 * Sets the x position of the vector
	 * @param x
	 */
	public void setX(float x)
	{
		this.x = x;
	}
	
	/**
	 * Gets the y position of the vector
	 * @return y position of the vector
	 */
	public float getY()
	{
		return y;
	}
	
	/**
	 * Sets the y position of the vector
	 * @param y
	 */
	public void setY(float y)
	{
		this.y = y;
	}
}
