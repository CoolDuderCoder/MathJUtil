/*
 * EPL-2.0 license
 * 
 * Rights CoolDuderCoder
 */

package org.MathJUtil.Matrixs;

public class Matrix2f 
{
	private float[][] m;
	
	public Matrix2f()
	{
		m = new float[2][2];
	}
	
	private Matrix2f(float[][] m)
	{	
		this.m = m;
	}
	
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
	
	public float[][] getM()
	{
		return m;
	}
	
	public void setM(float[][] m)
	{
		this.m = m;
	}
	
	public float get(int x, int y)
	{
		return m[x][y];
	}
	
	public void set(int x, int y, float value)
	{
		m[x][y] = value;
	}
	
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
