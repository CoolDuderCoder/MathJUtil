/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil.Matrixs;

public class Matrix4f
{
	private float[][] m;
	
	public Matrix4f()
	{
		m = new float[4][4];
	}
	
	private Matrix4f(float[][] m)
	{	
		this.m = m;
	}
	
	public static Matrix4f initIdentity(float[][] m)
	{
		m[0][0] = 1;	m[0][1] = 0;	m[0][2] = 0;	m[0][3] = 0;
		m[1][0] = 0;	m[1][1] = 1;	m[1][2] = 0;	m[1][3] = 0;
		m[2][0] = 0;	m[2][1] = 0;	m[2][2] = 1;	m[2][3] = 0;
		m[3][0] = 0;	m[3][1] = 0;	m[3][2] = 0;	m[3][3] = 1;
		
		return new Matrix4f(m);
	}
	
	public Matrix4f mul(Matrix4f r)
	{
		Matrix4f res = new Matrix4f();
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				res.set(i, j, m[i][0] * r.get(0, j) +
						m[i][1] * r.get(1, j) +
						m[i][2] * r.get(2, j) +
						m[i][3] * r.get(3, j));
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
		
		for (int i = 0; i < 4; i++)
		{
			res.append("[" + get(i, 0) + " " + get(i, 1) + " " + get(i, 2) + " " + get(i, 3) + "]" + "\n");
		}
		
		return res.toString();
	}
}