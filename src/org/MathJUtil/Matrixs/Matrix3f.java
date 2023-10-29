/*
 * EPL-2.0 license
 * 
 * Rights CoolDuderCoder
 */

package org.MathJUtil.Matrixs;

public class Matrix3f 
{
	private float[][] m;
	
	public Matrix3f()
	{
		m = new float[3][3];
	}
	
	private Matrix3f(float[][] m)
	{	
		this.m = m;
	}
	
	public static Matrix3f initIdentity(float[][] m)
	{
		m[0][0] = 1;	m[0][1] = 0;	m[0][2] = 0;
		m[1][0] = 0;	m[1][1] = 1;	m[1][2] = 0;
		m[2][0] = 0;	m[2][1] = 0;	m[2][2] = 1;
		
		return new Matrix3f(m);
	}
	
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
		
		for (int i = 0; i < 3; i++)
		{
			res.append("[" + get(i, 0) + " " + get(i, 1) + " " + get(i, 2) + "]" + "\n");
		}
		
		return res.toString();
	}
}
