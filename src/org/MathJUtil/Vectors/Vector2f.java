/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil.Vectors;

import org.MathJUtil.MathUtil;
import org.MathJUtil.Angles.Angle;

public class Vector2f 
{
	public static final Vector2f POSITIVE_X_AXIS = new Vector2f(1, 0);
	public static final Vector2f NEGATIVE_X_AXIS = new Vector2f(-1, 0);
	public static final Vector2f POSITIVE_Y_AXIS = new Vector2f(0, 1);
	public static final Vector2f NEGATIVE_Y_AXIS = new Vector2f(0, -1);
	
	private float x;
	private float y;
	
	public Vector2f()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public Vector2f(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public static Vector2f copy(Vector2f r)
	{
		return new Vector2f(r.getX(), r.getY());
	}
	
	public static float length(Vector2f r)
	{
		return (float)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY());
	}
	
	public static float dot(Vector2f a, Vector2f b)
	{
		return b.getX() * a.getX() + b.getY() * a.getY();
	}
	
	public static Vector2f normalize(Vector2f r)
	{
		float length = Vector2f.length(r);
		
		return new Vector2f(r.getX() / length, r.getY() / length);
	}
	
	public static Vector2f rotate(Vector2f r, Angle angle)
	{
		float rad = MathUtil.toRadians(angle.getAngle());
		float cos = MathUtil.cos(rad);
		float sin = MathUtil.sin(rad);
		
		return new Vector2f((float)(r.getX() * cos - r.getY() * sin), (float)(r.getX() * sin + r.getY() * cos));
	}
	
	public static Vector2f add(Vector2f a, Vector2f b)
	{
		return new Vector2f(a.getX() + b.getX(), a.getY() + b.getY());
	}
	
	public static Vector2f add(Vector2f a, float r)
	{
		return new Vector2f(a.getY() + r, a.getY() + r);
	}
	
	public static Vector2f sub(Vector2f a, Vector2f b)
	{
		return new Vector2f(a.getX() - b.getX(), a.getY() - b.getY());
	}
	
	public static Vector2f sub(Vector2f a, float r)
	{
		return new Vector2f(a.getX() - r, a.getY() - r);
	}
	
	public static Vector2f mul(Vector2f a, Vector2f b)
	{
		return new Vector2f(a.getX() * b.getX(), a.getY() * b.getY());
	}
	
	public static Vector2f mul(Vector2f a, float r)
	{
		return new Vector2f(a.getX() * r, a.getY() * r);
	}
	
	public static Vector2f div(Vector2f a, Vector2f b)
	{
		return new Vector2f(a.getX() / b.getX(), a.getY() / b.getY());
	}
	
	public static Vector2f div(Vector2f a, float r)
	{
		return new Vector2f(a.getX() / r, a.getY() / r);
	}
	
	public static Vector2f sin(Vector2f r, float amplitude)
	{
		return new Vector2f(MathUtil.sin(r.getX(), amplitude), MathUtil.sin(r.getY(), amplitude));
	}
	
	public static Vector2f cos(Vector2f r, float amplitude)
	{
		return new Vector2f(MathUtil.cos(r.getX(), amplitude), MathUtil.cos(r.getY(), amplitude));
	}
	
	public static Vector2f clamp(Vector2f r, Vector2f min, Vector2f max)
	{
		return new Vector2f(MathUtil.clamp(r.getX(), min.getX(), max.getX()), MathUtil.clamp(r.getY(), min.getY(), max.getY()));
	}
	
	public static Vector2f clamp(Vector2f r, float min, float max)
	{
		return new Vector2f(MathUtil.clamp(r.getX(), min, max), MathUtil.clamp(r.getY(), min, max));
	}
	
	@Deprecated
	public static void set(Vector2f a, Vector2f b)
	{
		a = b;
		
		return;
	}
	
	public static String toString(Vector2f r)
	{
		return "(" + r.getX() + " " + r.getY() + ")";
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
}
