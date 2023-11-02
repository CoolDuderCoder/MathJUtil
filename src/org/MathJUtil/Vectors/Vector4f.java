/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil.Vectors;

public class Vector4f 
{
	private float x;
	private float y;
	private float z;
	private float w;
	
	public Vector4f()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.w = 0;
	}
	
	public Vector4f(float x, float y, float z, float w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public static float length(Vector4f r)
	{
		return (float)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY() + r.getZ() * r.getZ() + r.getW() * r.getW());
	}
	
	public static float dot(Vector4f a, Vector4f r)
	{
		return a.getX() * r.getX() + a.getY() * r.getY() + a.getZ() * r.getZ() + a.getW() * r.getW();
	}
	
	public static Vector4f add(Vector4f a, Vector4f b)
	{
		return new Vector4f(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ(), a.getW() + b.getW());
	}
	
	public static Vector4f add(Vector4f a, float b)
	{
		return new Vector4f(a.getX() + b, a.getY() + b, a.getZ() + b, a.getW() + b);
	}
	
	public static Vector4f sub(Vector4f a, Vector4f b)
	{
		return new Vector4f(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ(), a.getW() - b.getW());
	}
	
	public static Vector4f sub(Vector4f a, float b)
	{
		return new Vector4f(a.getX() - b, a.getY() - b, a.getY() - b, a.getW() - b);
	}
	
	public static Vector4f mul(Vector4f a, Vector4f b)
	{
		return new Vector4f(a.getX() * b.getX(), a.getY() * b.getY(), a.getZ() * b.getZ(), a.getW() * b.getW());
	}
	
	public static Vector4f mul(Vector4f a, float b)
	{
		return new Vector4f(a.getX() * b, a.getY() * b, a.getZ() * b, a.getW() * b);
	}
	
	public static Vector4f div(Vector4f a, Vector4f b)
	{
		return new Vector4f(a.getX() / b.getX(), a.getY() / b.getY(), a.getZ() / b.getZ(), a.getW() / b.getW());
	}
	
	public static Vector4f div(Vector4f a, float b)
	{
		return new Vector4f(a.getX() / b, a.getY() / b, a.getZ() / b, a.getW() / b);
	}
	
	@Deprecated
	public static void set(Vector4f a, Vector4f b)
	{
		a = b;
		
		return;
	}
	
	public float getX()
	{
		return x;
	}
	
	public void setX(float x)
	{
		this.x = x;
	}
	
	public float getY()
	{
		return y;
	}
	
	public void setY(float y)
	{
		this.y = y;
	}
	
	public float getZ()
	{
		return z;
	}
	
	public void setZ(float z)
	{
		this.z = z;
	}
	
	public float getW()
	{
		return w;
	}
	
	public void setW(float w)
	{
		this.w = w;
	}
}
