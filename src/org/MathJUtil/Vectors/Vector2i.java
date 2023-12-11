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

/**
 * A 2D Int Vector
 * @author CoolDuderCoder
 */
public class Vector2i 
{
	public static final Vector2i POSITIVE_X_AXIS = new Vector2i(1, 0);
	public static final Vector2i NEGATIVE_X_AXIS = new Vector2i(-1, 0);
	public static final Vector2i POSITIVE_Y_AXIS = new Vector2i(0, 1);
	public static final Vector2i NEGATIVE_Y_AXIS = new Vector2i(0, -1);
	
	private int x;
	private int y;
	
	/**
	 * Creates a blank Vector2i
	 */
	public Vector2i()
	{
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Creates Vector2i
	 * @param x
	 * @param y
	 */
	public Vector2i(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Creates Vector2i
	 * @param r
	 */
	public Vector2i(int r)
	{
		this.x = r;
		this.y = r;
	}
	
	/**
	 * Copys the vector passed in
	 * @param r
	 * @return A copy of the vector passed in
	 */
	public static Vector2i copy(Vector2i r)
	{
		return new Vector2i(r.getX(), r.getY());
	}
	
	/**
	 * @param r
	 * @return length of the vector
	 */
	public static int length(Vector2i r)
	{
		return (int)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY());
	}
	
	/**
	 * Calculates the dot product of the two vectors
	 * @param a
	 * @param b
	 * @return dot product of the two vectors
	 */
	public static int dot(Vector2i a, Vector2i b)
	{
		return b.getX() * a.getX() + b.getY() * a.getY();
	}
	
	/**
	 * Calculates the normal of the vector
	 * @param r
	 * @return the normal of the vector
	 */
	public static Vector2i normalize(Vector2i r)
	{
		int length = Vector2i.length(r);
		
		return new Vector2i(r.getX() / length, r.getY() / length);
	}
	
	/**
	 * Adds the two vectors together
	 * @param a
	 * @param b
	 * @return two vectors added together
	 */
	public static Vector2i add(Vector2i a, Vector2i b)
	{
		return new Vector2i(a.getX() + b.getX(), a.getY() + b.getY());
	}
	
	/**
	 * Adds the vector and the integer
	 * @param a
	 * @param r
	 * @return vector and the integer added together
	 */
	public static Vector2i add(Vector2i a, int r)
	{
		return new Vector2i(a.getY() + r, a.getY() + r);
	}
	
	/**
	 * Subtracts the two vectors
	 * @param a
	 * @param b
	 * @return two vectors subtracted
	 */
	public static Vector2i sub(Vector2i a, Vector2i b)
	{
		return new Vector2i(a.getX() - b.getX(), a.getY() - b.getY());
	}
	
	/**
	 * Subtracts the vector and the integer
	 * @param a
	 * @param r
	 * @return vector and the integer subtracted
	 */
	public static Vector2i sub(Vector2i a, int r)
	{
		return new Vector2i(a.getX() - r, a.getY() - r);
	}
	
	/**
	 * Product the two vectors
	 * @param a
	 * @param b
	 * @return two vectors product
	 */
	public static Vector2i mul(Vector2i a, Vector2i b)
	{
		return new Vector2i(a.getX() * b.getX(), a.getY() * b.getY());
	}
	
	/**
	 * Product the vector and the integer
	 * @param a
	 * @param b
	 * @return the vector and the integer product
	 */
	public static Vector2i mul(Vector2i a, int r)
	{
		return new Vector2i(a.getX() * r, a.getY() * r);
	}
	
	/**
	 * Quotient the two vectors
	 * @param a
	 * @param b
	 * @return two vectors product
	 */
	public static Vector2i div(Vector2i a, Vector2i b)
	{
		return new Vector2i(a.getX() / b.getX(), a.getY() / b.getY());
	}
	
	/**
	 * Quotient the vector and the integer
	 * @param a
	 * @param b
	 * @return the vector and the integer quotient
	 */
	public static Vector2i div(Vector2i a, int r)
	{
		return new Vector2i(a.getX() / r, a.getY() / r);
	}
	
	/**
	 * Sets the first vector to the second vector
	 * @param a
	 * @param b
	 */
	@Deprecated
	public static void set(Vector2i a, Vector2i b)
	{
		a = b;
		
		return;
	}
	
	/**
	 * Returns the vector a to string
	 * @param r
	 * @return the vector to a string
	 */
	public static String toString(Vector2i r)
	{
		return "(" + r.getX() + " " + r.getY() + ")";
	}
	
	/**
	 * Gets the x position of the vector
	 * @return x position of the vector
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * Sets the x position of the vector
	 * @param x
	 */
	public void setX(int x)
	{
		this.x = x;
	}
	
	/**
	 * Gets the y position of the vector
	 * @return y position of the vector
	 */
	public int getY()
	{
		return y;
	}
	
	/**
	 * Sets the y position of the vector
	 * @param y
	 */
	public void setY(int y)
	{
		this.y = y;
	}
}
