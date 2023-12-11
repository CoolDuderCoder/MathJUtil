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

import org.MathJUtil.Quanternion;
import org.MathJUtil.Angles.Angle;
import org.MathJUtil.Angles.Angle3D;

/**
 * A 3D Float Vector
 * @author CoolDuderCoder
 */
public class Vector3f 
{
	public static final Vector3f POSITIVE_X_AXIS = new Vector3f(1, 0, 0);
	public static final Vector3f NEGATIVE_X_AXIS = new Vector3f(-1, 0, 0);
	public static final Vector3f POSITIVE_Y_AXIS = new Vector3f(0, 1, 0);
	public static final Vector3f NEGATIVE_Y_AXIS = new Vector3f(0, -1, 0);
	public static final Vector3f POSITIVE_Z_AXIS = new Vector3f(0, 0, 1);
	public static final Vector3f NEGATIVE_Z_AXIS = new Vector3f(0, 0, -1);
	
	private float x;
	private float y;
	private float z;
	
	/**
	 * Creates a blank Vector3f
	 */
	public Vector3f()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	/**
	 * Creates a Vector3f
	 * @param x
	 * @param y
	 * @param z
	 */
	public Vector3f(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * Creates a Vector3f
	 * @param r
	 */
	public Vector3f(float r)
	{
		this.x = r;
		this.y = r;
		this.z = r;
	}
	
	/**
	 * @param r
	 * @return length of the vector
	 */
	public static float length(Vector3f r)
	{
		return (float)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY() + r.getZ() * r.getZ());
	}
	
	/**
	 * Calculates the dot product of the two vectors
	 * @param a
	 * @param b
	 * @return dot product of the two vectors
	 */
	public static float dot(Vector3f a, Vector3f r)
	{
		return a.getX() * r.getX() + a.getY() * r.getY() + a.getZ() * r.getZ();
	}
	
	/**
	 * Calculates the cross of the vector
	 * @param r
	 * @return the cross of the vector
	 */
	public static Vector3f cross(Vector3f a, Vector3f r)
	{
		float x_ = a.getY() * r.getZ() - a.getZ() * r.getY();
		float y_ = a.getZ() * r.getX() - a.getX() * r.getZ();
		float z_ = a.getX() * r.getY() - a.getY() * r.getX();
		
		return new Vector3f(x_, y_, z_);
	}
	
	/**
	 * Calculates the normal of the vector
	 * @param r
	 * @return the normal of the vector
	 */
	public static Vector3f normalize(Vector3f r)
	{
		float length = Vector3f.length(r);
		
		float x = r.getX() / length;
		float y = r.getY() / length;
		float z = r.getZ() / length;
		
		return new Vector3f(x, y, z);
	}
	
	/**
	 * Calculates rotation of the vector
	 * @param r
	 * @param angle
	 * @param axis
	 * @return Rotation of the vector
	 */
	public static Vector3f rotate(Vector3f r, Angle angle, Vector3f axis)
	{
		float sinHalfAngle = (float)Math.sin(Math.toRadians(angle.getAngle()*0.5f));
		float cosHalfAngle = (float)Math.cos(Math.toRadians(angle.getAngle()*0.5f));
		
		float rX = axis.getX() * sinHalfAngle;
		float rY = axis.getY() * sinHalfAngle;
		float rZ = axis.getZ() * sinHalfAngle;
		float rW = cosHalfAngle;
		
		Quanternion rotation = new Quanternion(rX, rY, rZ, rW);
		Quanternion conjugate = Quanternion.conjugate(rotation);
		
		Quanternion w = Quanternion.mul(Quanternion.mul(rotation, r), conjugate);
		
		float x = w.getX();
		float y = w.getY();
		float z = w.getZ();
		
		return new Vector3f(x, y, z);
	}
	
	/**
	 * Calculates rotation of the vector
	 * @param r
	 * @param angle
	 * @return Rotation of the vector
	 */
	public static Vector3f rotate(Vector3f r, Angle3D angle)
	{
		return new Vector3f(rotate(r, new Angle(angle.getAngle().getX()), POSITIVE_X_AXIS).x, rotate(r, new Angle(angle.getAngle().getY()), POSITIVE_Y_AXIS).y, rotate(r, new Angle(angle.getAngle().getZ()), POSITIVE_Z_AXIS).z);
	}
	
	/**
	 * Adds the two vectors together
	 * @param a
	 * @param b
	 * @return two vectors added together
	 */
	public static Vector3f add(Vector3f a, Vector3f b)
	{
		return new Vector3f(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
	}
	
	/**
	 * Adds the vector and the float
	 * @param a
	 * @param r
	 * @return vector and the float added together
	 */
	public static Vector3f add(Vector3f a, float b)
	{
		return new Vector3f(a.getX() + b, a.getY() + b, a.getZ() + b);
	}
	
	/**
	 * Subtracts the two vectors
	 * @param a
	 * @param b
	 * @return two vectors subtracted
	 */
	public static Vector3f sub(Vector3f a, Vector3f b)
	{
		return new Vector3f(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
	}
	
	/**
	 * Subtracts the vector and the float
	 * @param a
	 * @param r
	 * @return vector and the float subtracted
	 */
	public static Vector3f sub(Vector3f a, float b)
	{
		return new Vector3f(a.getX() - b, a.getY() - b, a.getY() - b);
	}
	
	/**
	 * Product the two vectors
	 * @param a
	 * @param b
	 * @return two vectors product
	 */
	public static Vector3f mul(Vector3f a, Vector3f b)
	{
		return new Vector3f(a.getX() * b.getX(), a.getY() * b.getY(), a.getZ() * b.getZ());
	}
	
	/**
	 * Product the vector and the float
	 * @param a
	 * @param b
	 * @return the vector and the float product
	 */
	public static Vector3f mul(Vector3f a, float b)
	{
		return new Vector3f(a.getX() * b, a.getY() * b, a.getZ() * b);
	}
	
	/**
	 * Quotient the two vectors
	 * @param a
	 * @param b
	 * @return two vectors product
	 */
	public static Vector3f div(Vector3f a, Vector3f b)
	{
		return new Vector3f(a.getX() / b.getX(), a.getY() / b.getY(), a.getZ() / b.getZ());
	}
	
	/**
	 * Quotient the vector and the float
	 * @param a
	 * @param b
	 * @return the vector and the float quotient
	 */
	public static Vector3f div(Vector3f a, float b)
	{
		return new Vector3f(a.getX() / b, a.getY() / b, a.getZ() / b);
	}
	
	/**
	 * Sets the first vector to the second vector
	 * @param a
	 * @param b
	 */
	@Deprecated
	public static void set(Vector3f a, Vector3f b)
	{
		a = b;
		
		return;
	}
	
	/**
	 * Returns the vector a to string
	 * @param r
	 * @return the vector to a string
	 */
	public static String toString(Vector3f r)
	{
		return "(" + r.getX() + " " + r.getY() + " " + r.getZ() + ")";
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
	
	/**
	 * Gets the z position of the vector
	 * @return z position of the vector
	 */
	public float getZ()
	{
		return z;
	}
	
	/**
	 * Sets the z position of the vector
	 * @param z
	 */
	public void setZ(float z)
	{
		this.z = z;
	}
}
