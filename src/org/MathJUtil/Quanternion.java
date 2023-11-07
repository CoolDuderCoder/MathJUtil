/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil;

import org.MathJUtil.Vectors.Vector3f;

public class Quanternion
{
	private float x;
	private float y;
	private float z;
	private float w;
	
	public Quanternion(float x, float y, float z, float w)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	public static float length(Quanternion r)
	{
		return (float)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY() + r.getZ() * r.getZ() + r.getW() * r.getW());
	}
	
	public static Quanternion normalize(Quanternion r)
	{
		float length = length(r);
		
		return new Quanternion(r.getX() / length, r.getY() / length, r.getZ() / length, r.getW() / length);
	}
	
	public static Quanternion conjugate(Quanternion r)
	{
		return new Quanternion(-r.getX(), -r.getY(), -r.getZ(), -r.getW());
	}
	
	public static Quanternion mul(Quanternion a, Quanternion r)
	{
		float w_ = a.getW() * r.getW() - a.getX() * r.getX() - a.getY() * r.getY() - a.getZ() * r.getZ();
		float x_ = a.getX() * r.getW() + a.getW() * r.getX() + a.getY() * r.getZ() - a.getZ() * r.getY();
		float y_ = a.getY() * r.getW() + a.getW() * r.getY() + a.getZ() * r.getX() - a.getX() * r.getZ();
		float z_ = a.getZ() * r.getW() + a.getW() * r.getZ() + a.getX() * r.getY() - a.getY() * r.getX();
		
		return new Quanternion(x_, y_, z_, w_);
	}
	
	public static Quanternion mul(Quanternion a, Vector3f r)
	{
		float w_ = -a.getX() * r.getX() - a.getY() * r.getY() - a.getZ() * r.getZ();
		float x_ =  a.getW() * r.getX() + a.getY() * r.getZ() - a.getZ() * r.getY();
		float y_ =  a.getW() * r.getY() + a.getZ() * r.getX() - a.getX() * r.getZ();
		float z_ =  a.getW() * r.getZ() + a.getX() * r.getY() - a.getY() * r.getX();
		
		return new Quanternion(x_, y_, z_, w_);
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
