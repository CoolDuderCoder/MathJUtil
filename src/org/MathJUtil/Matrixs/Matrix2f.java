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
 * A 2x2 Float Matrix
 * @author CoolDuderCoder
 */
public class Matrix2f 
{
	private float[][] m;
	
	/**
	 * Initializing Matrix2f
	 */
	public Matrix2f()
	{
		m = new float[2][2];
	}
	
	/**
	 * Initializing Matrix2f with the matrix set to whatever is passed in
	 * @param m
	 */
	private Matrix2f(float[][] m)
	{	
		this.m = m;
	}
	
	/**
	 * returns the identity of a Matrix
	 * @param m
	 * @return identity of a Matrix
	 */
	public static Matrix2f initIdentity(float[][] m)
	{
		m[0][0] = 1;	m[0][1] = 0;
		m[1][0] = 0;	m[1][1] = 1;
		
		return new Matrix2f(m);
	}
	
	public Matrix2f mul(Matrix2f r)
	{
		Matrix2f res = new Matrix2f();
		
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				res.set(i, j, m[i][0] * r.get(0, j) +
						m[i][1] * r.get(1, j));
			}
		}
		
		return res;
	}
	
	/**
	 * gets Matrix
	 * @return matrix;
	 */
	public float[][] getM()
	{
		return m;
	}
	
	/**
	 * sets Matrix
	 * @param m
	 */
	public void setM(float[][] m)
	{
		this.m = m;
	}
	
	/**
	 * Gets the value at the x and y was passed in
	 * @param x
	 * @param y
	 * @return the value at the x and y parameters
	 */
	public float get(int x, int y)
	{
		return m[x][y];
	}
	
	/**
	 * Sets the value at the x and that was passed in
	 * @param x
	 * @param y
	 * @param value
	 */
	public void set(int x, int y, float value)
	{
		m[x][y] = value;
	}
	
	/**
	 * Turns the matrix into a String
	 */
	public String toString()
	{
		StringBuilder res = new StringBuilder();
		
		for (int i = 0; i < 2; i++)
		{
			res.append("[" + get(i, 0) + " " + get(i, 1) + " " + get(i, 2) + "]" + "\n");
		}
		
		return res.toString();
	}
}
