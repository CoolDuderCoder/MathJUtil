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
 * A 3D Int Vector
 * @author CoolDuderCoder
 */
public class Vector3i 
{
	public static final Vector3i POSITIVE_X_AXIS = new Vector3i(1, 0, 0);
	public static final Vector3i NEGATIVE_X_AXIS = new Vector3i(-1, 0, 0);
	public static final Vector3i POSITIVE_Y_Axis = new Vector3i(0, 1, 0);
	public static final Vector3i NEGATIVE_Y_AXIS = new Vector3i(0, -1, 0);
	public static final Vector3i POSITIVE_Z_AXIS = new Vector3i(0, 0, 1);
	public static final Vector3i NEGATIVE_Z_AXIS = new Vector3i(0, 0, -1);
	
	private int x;
	private int y;
	private int z;
	
	/**
	 * Creates a blank Vector3i
	 */
	public Vector3i()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	/**
	 * Creates a Vector3i
	 * @param x
	 * @param y
	 * @param z
	 */
	public Vector3i(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Creates a Vector3i
	 * @param r
	 */
	public Vector3i(int r)
	{
		this.x = r;
		this.y = r;
		this.z = r;
	}
	
	/**
	 * @param r
	 * @return length of the vector
	 */
	public static int length(Vector3i r)
	{
		return (int)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY() + r.getZ() * r.getZ());
	}
	
	/**
	 * Calculates the dot product of the two vectors
	 * @param a
	 * @param b
	 * @return dot product of the two vectors
	 */
	public static int dot(Vector3i a, Vector3i r)
	{
		return a.getX() * r.getX() + a.getY() * r.getY() + a.getZ() * r.getZ();
	}
	
	/**
	 * Calculates the cross of the vector
	 * @param r
	 * @return the cross of the vector
	 */
	public static Vector3i cross(Vector3i a, Vector3i r)
	{
		int x_ = a.getY() * r.getZ() - a.getZ() * r.getY();
		int y_ = a.getZ() * r.getX() - a.getX() * r.getZ();
		int z_ = a.getX() * r.getY() - a.getY() * r.getX();
		
		return new Vector3i(x_, y_, z_);
	}
	
	/**
	 * Calculates the normal of the vector
	 * @param r
	 * @return the normal of the vector
	 */
	public static Vector3i normalize(Vector3i r)
	{
		int length = Vector3i.length(r);
		
		int x = r.getX() / length;
		int y = r.getY() / length;
		int z = r.getZ() / length;
		
		return new Vector3i(x, y, z);
	}
	
	/**
	 * Adds the two vectors together
	 * @param a
	 * @param b
	 * @return two vectors added together
	 */
	public static Vector3i add(Vector3i a, Vector3i b)
	{
		return new Vector3i(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
	}
	
	/**
	 * Adds the vector and the integer
	 * @param a
	 * @param r
	 * @return vector and the integer added together
	 */
	public static Vector3i add(Vector3i a, int b)
	{
		return new Vector3i(a.getX() + b, a.getY() + b, a.getZ() + b);
	}
	
	/**
	 * Subtracts the two vectors
	 * @param a
	 * @param b
	 * @return two vectors subtracted
	 */
	public static Vector3i sub(Vector3i a, Vector3i b)
	{
		return new Vector3i(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
	}
	
	/**
	 * Subtracts the vector and the integer
	 * @param a
	 * @param r
	 * @return vector and the integer subtracted
	 */
	public static Vector3i sub(Vector3i a, int b)
	{
		return new Vector3i(a.getX() - b, a.getY() - b, a.getY() - b);
	}
	
	/**
	 * Product the two vectors
	 * @param a
	 * @param b
	 * @return two vectors product
	 */
	public static Vector3i mul(Vector3i a, Vector3i b)
	{
		return new Vector3i(a.getX() * b.getX(), a.getY() * b.getY(), a.getZ() * b.getZ());
	}
	
	/**
	 * Product the vector and the integer
	 * @param a
	 * @param b
	 * @return the vector and the integer product
	 */
	public static Vector3i mul(Vector3i a, int b)
	{
		return new Vector3i(a.getX() * b, a.getY() * b, a.getZ() * b);
	}
	
	/**
	 * Quotient the two vectors
	 * @param a
	 * @param b
	 * @return two vectors product
	 */
	public static Vector3i div(Vector3i a, Vector3i b)
	{
		return new Vector3i(a.getX() / b.getX(), a.getY() / b.getY(), a.getZ() / b.getZ());
	}
	
	/**
	 * Quotient the vector and the integer
	 * @param a
	 * @param b
	 * @return the vector and the integer quotient
	 */
	public static Vector3i div(Vector3i a, int b)
	{
		return new Vector3i(a.getX() / b, a.getY() / b, a.getZ() / b);
	}
	
	/**
	 * Sets the first vector to the second vector
	 * @param a
	 * @param b
	 */
	@Deprecated
	public static void set(Vector3i a, Vector3i b)
	{
		a = b;
		
		return;
	}
	
	/**
	 * Returns the vector a to string
	 * @param r
	 * @return the vector to a string
	 */
	public static String toString(Vector3i r)
	{
		return "(" + r.getX() + " " + r.getY() + " " + r.getZ() + ")";
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
}
