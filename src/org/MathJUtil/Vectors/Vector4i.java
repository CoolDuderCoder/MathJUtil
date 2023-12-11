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
 * A 4D Int Vector
 * @author CoolDuderCoder
 */
public class Vector4i 
{
	private int x;
	private int y;
	private int z;
	private int w;
	
	/**
	 * Creates a blank Vector4i
	 */
	public Vector4i()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.w = 0;
	}
	
	/**
	 * Creates a Vector4i
	 * @param x
	 * @param y
	 * @param z
	 * @param w
	 */
	public Vector4i(int x, int y, int z, int w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Creates a Vector4i
	 * @param r
	 */
	public Vector4i(int r)
	{
		this.x = r;
		this.y = r;
		this.z = r;
		this.w = r;
	}
	
	/**
	 * @param r
	 * @return length of the vector
	 */
	public static int length(Vector4i r)
	{
		return (int)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY() + r.getZ() * r.getZ() + r.getW() * r.getW());
	}
	
	/**
	 * Calculates the dot product of the two vectors
	 * @param a
	 * @param b
	 * @return dot product of the two vectors
	 */
	public static int dot(Vector4i a, Vector4i r)
	{
		return a.getX() * r.getX() + a.getY() * r.getY() + a.getZ() * r.getZ() + a.getW() * r.getW();
	}
	
	/**
	 * Adds the two vectors together
	 * @param a
	 * @param b
	 * @return two vectors added together
	 */
	public static Vector4i add(Vector4i a, Vector4i b)
	{
		return new Vector4i(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ(), a.getW() + b.getW());
	}
	
	/**
	 * Adds the vector and the integer
	 * @param a
	 * @param r
	 * @return vector and the integer added together
	 */
	public static Vector4i add(Vector4i a, int b)
	{
		return new Vector4i(a.getX() + b, a.getY() + b, a.getZ() + b, a.getW() + b);
	}
	
	/**
	 * Subtracts the two vectors
	 * @param a
	 * @param b
	 * @return two vectors subtracted
	 */
	public static Vector4i sub(Vector4i a, Vector4i b)
	{
		return new Vector4i(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ(), a.getW() - b.getW());
	}
	
	/**
	 * Subtracts the vector and the integer
	 * @param a
	 * @param r
	 * @return vector and the integer subtracted
	 */
	public static Vector4i sub(Vector4i a, int b)
	{
		return new Vector4i(a.getX() - b, a.getY() - b, a.getY() - b, a.getW() - b);
	}
	
	/**
	 * Product the two vectors
	 * @param a
	 * @param b
	 * @return two vectors product
	 */
	public static Vector4i mul(Vector4i a, Vector4i b)
	{
		return new Vector4i(a.getX() * b.getX(), a.getY() * b.getY(), a.getZ() * b.getZ(), a.getW() * b.getW());
	}
	
	/**
	 * Product the vector and the integer
	 * @param a
	 * @param b
	 * @return the vector and the integer product
	 */
	public static Vector4i mul(Vector4i a, int b)
	{
		return new Vector4i(a.getX() * b, a.getY() * b, a.getZ() * b, a.getW() * b);
	}
	
	/**
	 * Quotient the two vectors
	 * @param a
	 * @param b
	 * @return two vectors product
	 */
	public static Vector4i div(Vector4i a, Vector4i b)
	{
		return new Vector4i(a.getX() / b.getX(), a.getY() / b.getY(), a.getZ() / b.getZ(), a.getW() / b.getW());
	}
	
	/**
	 * Quotient the vector and the integer
	 * @param a
	 * @param b
	 * @return the vector and the integer quotient
	 */
	public static Vector4i div(Vector4i a, int b)
	{
		return new Vector4i(a.getX() / b, a.getY() / b, a.getZ() / b, a.getW() / b);
	}
	
	/**
	 * Sets the first vector to the second vector
	 * @param a
	 * @param b
	 */
	@Deprecated
	public static void set(Vector4i a, Vector4i b)
	{
		a = b;
		
		return;
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
	
	/**
	 * Gets the z position of the vector
	 * @return z position of the vector
	 */
	public int getZ()
	{
		return z;
	}
	
	/**
	 * Sets the z position of the vector
	 * @param z
	 */
	public void setZ(int z)
	{
		this.z = z;
	}
	
	/**
	 * Gets the w position of the vector
	 * @return w position of the vector
	 */
	public int getW()
	{
		return w;
	}
	
	/**
	 * Sets the w position of the vector
	 * @param w
	 */
	public void setW(int w)
	{
		this.w = w;
	}
}
