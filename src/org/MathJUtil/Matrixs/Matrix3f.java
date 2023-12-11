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

package org.MathJUtil.Matrixs;

/**
 * A 3x3 Float Matrix
 * @author CoolDuderCoder
 */
public class Matrix3f 
{
	private float[][] m;
	
	/**
	 * Initializing Matrix3f
	 */
	public Matrix3f()
	{
		m = new float[3][3];
	}
	
	/**
	 * Initializing Matrix3f with the matrix set to what the m is set to
	 * @param m
	 */
	private Matrix3f(float[][] m)
	{	
		this.m = m;
	}
	
	/**
	 * Returns Matrix identity
	 * @param m
	 * @return Matrix identity
	 */
	public static Matrix3f initIdentity(float[][] m)
	{
		m[0][0] = 1;	m[0][1] = 0;	m[0][2] = 0;
		m[1][0] = 0;	m[1][1] = 1;	m[1][2] = 0;
		m[2][0] = 0;	m[2][1] = 0;	m[2][2] = 1;
		
		return new Matrix3f(m);
	}
	
	/**
	 * Multiplies a 3x3 matrix by a 3x3 matrix
	 * @param r
	 * @return Product of a 3x3 matrix by a 3x3 matrix
	 */
	public Matrix3f mul(Matrix3f r)
	{
		Matrix3f res = new Matrix3f();
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				res.set(i, j, m[i][0] * r.get(0, j) +
						m[i][1] * r.get(1, j) +
						m[i][2] * r.get(2, j));
			}
		}
		
		return res;
	}
	
	/**
	 * Gets matrix
	 * @return matrix
	 */
	public float[][] getM()
	{
		return m;
	}
	
	/**
	 * Sets matrix
	 * @param m
	 */
	public void setM(float[][] m)
	{
		this.m = m;
	}
	
	/**
	 * Gets the value at the x and y of the matrix
	 * @param x
	 * @param y
	 * @return value at the x and y of the matrix
	 */
	public float get(int x, int y)
	{
		return m[x][y];
	}
	
	/**
	 * Sets the value at the x and y of the matrix
	 * @param x
	 * @param y
	 * @param value
	 */
	public void set(int x, int y, float value)
	{
		m[x][y] = value;
	}
	
	/**
	 * Turns the matrix to a string
	 */
	public String toString()
	{
		StringBuilder res = new StringBuilder();
		
		for (int i = 0; i < 3; i++)
		{
			res.append("[" + get(i, 0) + " " + get(i, 1) + " " + get(i, 2) + "]" + "\n");
		}
		
		return res.toString();
	}
}
