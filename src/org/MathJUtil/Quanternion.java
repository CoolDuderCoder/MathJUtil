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

package org.MathJUtil;

import org.MathJUtil.Vectors.Vector3f;

/**
 * A Quanternion class
 * @author CoolDuderCoder
 */
public class Quanternion
{
	private float x;
	private float y;
	private float z;
	private float w;
	
	/**
	 * Initiliazing Quanternion
	 * @param x
	 * @param y
	 * @param z
	 * @param w
	 */
	public Quanternion(float x, float y, float z, float w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	/**
	 * Calculates Length of the Quanternion
	 * @param r
	 * @return Length of the Quanternion
	 */
	public static float length(Quanternion r)
	{
		return (float)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY() + r.getZ() * r.getZ() + r.getW() * r.getW());
	}
	
	/**
	 * Calculates Normalized Quanternion
	 * @param r
	 * @return Normalized Quanternion
	 */
	public static Quanternion normalize(Quanternion r)
	{
		float length = length(r);
		
		return new Quanternion(r.getX() / length, r.getY() / length, r.getZ() / length, r.getW() / length);
	}
	
	/**
	 * Calculates Conjugate Quanternion or a negative Quanternion
	 * @param r
	 * @return Conjugate Quanternion or a negative Quanternion
	 */
	public static Quanternion conjugate(Quanternion r)
	{
		return new Quanternion(-r.getX(), -r.getY(), -r.getZ(), -r.getW());
	}
	
	/**
	 * Calculates Multiplies a Quanternion by a Quanternion
	 * @param a
	 * @param r
	 * @return Product of a Quanternion by a Quanternion
	 */
	public static Quanternion mul(Quanternion a, Quanternion r)
	{
		float w_ = a.getW() * r.getW() - a.getX() * r.getX() - a.getY() * r.getY() - a.getZ() * r.getZ();
		float x_ = a.getX() * r.getW() + a.getW() * r.getX() + a.getY() * r.getZ() - a.getZ() * r.getY();
		float y_ = a.getY() * r.getW() + a.getW() * r.getY() + a.getZ() * r.getX() - a.getX() * r.getZ();
		float z_ = a.getZ() * r.getW() + a.getW() * r.getZ() + a.getX() * r.getY() - a.getY() * r.getX();
		
		return new Quanternion(x_, y_, z_, w_);
	}
	
	/**
	 * Calculates Multiplies a Quanternion by a 3D float vector
	 * @param a
	 * @param r
	 * @return Product of a Quanternion by a 3D float vector
	 */
	public static Quanternion mul(Quanternion a, Vector3f r)
	{
		float w_ = -a.getX() * r.getX() - a.getY() * r.getY() - a.getZ() * r.getZ();
		float x_ =  a.getW() * r.getX() + a.getY() * r.getZ() - a.getZ() * r.getY();
		float y_ =  a.getW() * r.getY() + a.getZ() * r.getX() - a.getX() * r.getZ();
		float z_ =  a.getW() * r.getZ() + a.getX() * r.getY() - a.getY() * r.getX();
		
		return new Quanternion(x_, y_, z_, w_);
	}
	
	/**
	 * Returns the x position
	 * @return x position
	 */
	public float getX()
	{
		return x;
	}
	
	/**
	 * Sets the x position
	 */
	public void setX(float x)
	{
		this.x = x;
	}
	
	/**
	 * Returns the y position
	 * @return y position
	 */
	public float getY()
	{
		return y;
	}
	
	/**
	 * Sets the y position
	 */
	public void setY(float y)
	{
		this.y = y;
	}
	
	/**
	 * Returns the z position
	 * @return z position
	 */
	public float getZ()
	{
		return z;
	}
	
	/**
	 * Sets the z position
	 */
	public void setZ(float z)
	{
		this.z = z;
	}
	
	/**
	 * Returns the w position
	 * @return w position
	 */
	public float getW()
	{
		return w;
	}
	
	/**
	 * Sets the w position
	 */
	public void setW(float w)
	{
		this.w = w;
	}
}
