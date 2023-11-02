/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil.Vectors;

public class Vector2i 
{
	public static final Vector2i POSITIVE_X_AXIS = new Vector2i(1, 0);
	public static final Vector2i NEGATIVE_X_AXIS = new Vector2i(-1, 0);
	public static final Vector2i POSITIVE_Y_AXIS = new Vector2i(0, 1);
	public static final Vector2i NEGATIVE_Y_AXIS = new Vector2i(0, -1);
	
	private int x;
	private int y;
	
	public Vector2i()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public Vector2i(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public static Vector2i copy(Vector2i r)
	{
		return new Vector2i(r.getX(), r.getY());
	}
	
	public static int length(Vector2i r)
	{
		return (int)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY());
	}
	
	public static int dot(Vector2i a, Vector2i b)
	{
		return b.getX() * a.getX() + b.getY() * a.getY();
	}
	
	public static Vector2i normalize(Vector2i r)
	{
		int length = Vector2i.length(r);
		
		return new Vector2i(r.getX() / length, r.getY() / length);
	}
	
	public static Vector2i add(Vector2i a, Vector2i b)
	{
		return new Vector2i(a.getX() + b.getX(), a.getY() + b.getY());
	}
	
	public static Vector2i add(Vector2i a, int r)
	{
		return new Vector2i(a.getY() + r, a.getY() + r);
	}
	
	public static Vector2i sub(Vector2i a, Vector2i b)
	{
		return new Vector2i(a.getX() - b.getX(), a.getY() - b.getY());
	}
	
	public static Vector2i sub(Vector2i a, int r)
	{
		return new Vector2i(a.getX() - r, a.getY() - r);
	}
	
	public static Vector2i mul(Vector2i a, Vector2i b)
	{
		return new Vector2i(a.getX() * b.getX(), a.getY() * b.getY());
	}
	
	public static Vector2i mul(Vector2i a, int r)
	{
		return new Vector2i(a.getX() * r, a.getY() * r);
	}
	
	public static Vector2i div(Vector2i a, Vector2i b)
	{
		return new Vector2i(a.getX() / b.getX(), a.getY() / b.getY());
	}
	
	public static Vector2i div(Vector2i a, int r)
	{
		return new Vector2i(a.getX() / r, a.getY() / r);
	}
	
	@Deprecated
	public static void set(Vector2i a, Vector2i b)
	{
		a = b;
		
		return;
	}
	
	public static String toString(Vector2i r)
	{
		return "(" + r.getX() + " " + r.getY() + ")";
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
}
