/*
 * EPL-2.0 license
 * 
 * Rights CoolDuderCoder
 */

package org.MathJUtil.Vectors;

import org.MathJUtil.Quanternion;
import org.MathJUtil.Angles.Angle;

public class Vector3f 
{
	public static final Vector3f POSITIVE_X_AXIS = new Vector3f(1, 0, 0);
	public static final Vector3f NEGATIVE_X_AXIS = new Vector3f(-1, 0, 0);
	public static final Vector3f POSITIVE_Y_Axis = new Vector3f(0, 1, 0);
	public static final Vector3f NEGATIVE_Y_AXIS = new Vector3f(0, -1, 0);
	public static final Vector3f POSITIVE_Z_AXIS = new Vector3f(0, 0, 1);
	public static final Vector3f NEGATIVE_Z_AXIS = new Vector3f(0, 0, -1);
	
	private float x;
	private float y;
	private float z;
	
	public Vector3f(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static float length(Vector3f r)
	{
		return (float)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY() + r.getZ() * r.getZ());
	}
	
	public static float dot(Vector3f a, Vector3f r)
	{
		return a.getX() * r.getX() + a.getY() * r.getY() + a.getZ() * r.getZ();
	}
	
	public static Vector3f cross(Vector3f a, Vector3f r)
	{
		float x_ = a.getY() * r.getZ() - a.getZ() * r.getY();
		float y_ = a.getZ() * r.getX() - a.getX() * r.getZ();
		float z_ = a.getX() * r.getY() - a.getY() * r.getX();
		
		return new Vector3f(x_, y_, z_);
	}
	
	public static Vector3f normalize(Vector3f r)
	{
		float length = Vector3f.length(r);
		
		float x = r.getX() / length;
		float y = r.getY() / length;
		float z = r.getZ() / length;
		
		return new Vector3f(x, y, z);
	}
	
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
	
	public static Vector3f add(Vector3f a, Vector3f b)
	{
		return new Vector3f(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
	}
	
	public static Vector3f add(Vector3f a, float b)
	{
		return new Vector3f(a.getX() + b, a.getY() + b, a.getZ() + b);
	}
	
	public static Vector3f sub(Vector3f a, Vector3f b)
	{
		return new Vector3f(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
	}
	
	public static Vector3f sub(Vector3f a, float b)
	{
		return new Vector3f(a.getX() - b, a.getY() - b, a.getY() - b);
	}
	
	public static Vector3f mul(Vector3f a, Vector3f b)
	{
		return new Vector3f(a.getX() * b.getX(), a.getY() * b.getY(), a.getZ() * b.getZ());
	}
	
	public static Vector3f mul(Vector3f a, float b)
	{
		return new Vector3f(a.getX() * b, a.getY() * b, a.getZ() * b);
	}
	
	public static Vector3f div(Vector3f a, Vector3f b)
	{
		return new Vector3f(a.getX() / b.getX(), a.getY() / b.getY(), a.getZ() / b.getZ());
	}
	
	public static Vector3f div(Vector3f a, float b)
	{
		return new Vector3f(a.getX() / b, a.getY() / b, a.getZ() / b);
	}
	
	public static void set(Vector3f a, Vector3f b)
	{
		a = b;
		
		return;
	}
	
	public static String toString(Vector3f r)
	{
		return "(" + r.getX() + " " + r.getY() + " " + r.getZ() + ")";
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
}
