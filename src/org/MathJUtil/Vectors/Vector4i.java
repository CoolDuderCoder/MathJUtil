/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil.Vectors;

public class Vector4i 
{
	private int x;
	private int y;
	private int z;
	private int w;
	
	public Vector4i()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.w = 0;
	}
	
	public Vector4i(int x, int y, int z, int w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public Vector4i(int r)
	{
		this.x = r;
		this.y = r;
		this.z = r;
		this.w = r;
	}
	
	public static int length(Vector4i r)
	{
		return (int)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY() + r.getZ() * r.getZ() + r.getW() * r.getW());
	}
	
	public static int dot(Vector4i a, Vector4i r)
	{
		return a.getX() * r.getX() + a.getY() * r.getY() + a.getZ() * r.getZ() + a.getW() * r.getW();
	}
	
	public static Vector4i add(Vector4i a, Vector4i b)
	{
		return new Vector4i(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ(), a.getW() + b.getW());
	}
	
	public static Vector4i add(Vector4i a, int b)
	{
		return new Vector4i(a.getX() + b, a.getY() + b, a.getZ() + b, a.getW() + b);
	}
	
	public static Vector4i sub(Vector4i a, Vector4i b)
	{
		return new Vector4i(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ(), a.getW() - b.getW());
	}
	
	public static Vector4i sub(Vector4i a, int b)
	{
		return new Vector4i(a.getX() - b, a.getY() - b, a.getY() - b, a.getW() - b);
	}
	
	public static Vector4i mul(Vector4i a, Vector4i b)
	{
		return new Vector4i(a.getX() * b.getX(), a.getY() * b.getY(), a.getZ() * b.getZ(), a.getW() * b.getW());
	}
	
	public static Vector4i mul(Vector4i a, int b)
	{
		return new Vector4i(a.getX() * b, a.getY() * b, a.getZ() * b, a.getW() * b);
	}
	
	public static Vector4i div(Vector4i a, Vector4i b)
	{
		return new Vector4i(a.getX() / b.getX(), a.getY() / b.getY(), a.getZ() / b.getZ(), a.getW() / b.getW());
	}
	
	public static Vector4i div(Vector4i a, int b)
	{
		return new Vector4i(a.getX() / b, a.getY() / b, a.getZ() / b, a.getW() / b);
	}
	
	@Deprecated
	public static void set(Vector4i a, Vector4i b)
	{
		a = b;
		
		return;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public int getZ()
	{
		return z;
	}
	
	public void setZ(int z)
	{
		this.z = z;
	}
	
	public int getW()
	{
		return w;
	}
	
	public void setW(int w)
	{
		this.w = w;
	}
}
