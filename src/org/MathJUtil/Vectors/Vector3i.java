/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil.Vectors;

public class Vector3i 
{
	public static final Vector3i POSITIVE_X_AXIS = new Vector3i(1, 0, 0);
	public static final Vector3i NEGATIVE_X_AXIS = new Vector3i(-1, 0, 0);
	public static final Vector3i POSITIVE_Y_Axis = new Vector3i(0, 1, 0);
	public static final Vector3i NEGATIVE_Y_AXIS = new Vector3i(0, -1, 0);
	public static final Vector3i POSITIVE_Z_AXIS = new Vector3i(0, 0, 1);
	public static final Vector3i NEGATIVE_Z_AXIS = new Vector3i(0, 0, -1);
	
	private int x;
	private int y;
	private int z;
	
	public Vector3i()
	{
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Vector3i(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static int length(Vector3i r)
	{
		return (int)Math.sqrt(r.getX() * r.getX() + r.getY() * r.getY() + r.getZ() * r.getZ());
	}
	
	public static int dot(Vector3i a, Vector3i r)
	{
		return a.getX() * r.getX() + a.getY() * r.getY() + a.getZ() * r.getZ();
	}
	
	public static Vector3i cross(Vector3i a, Vector3i r)
	{
		int x_ = a.getY() * r.getZ() - a.getZ() * r.getY();
		int y_ = a.getZ() * r.getX() - a.getX() * r.getZ();
		int z_ = a.getX() * r.getY() - a.getY() * r.getX();
		
		return new Vector3i(x_, y_, z_);
	}
	
	public static Vector3i normalize(Vector3i r)
	{
		int length = Vector3i.length(r);
		
		int x = r.getX() / length;
		int y = r.getY() / length;
		int z = r.getZ() / length;
		
		return new Vector3i(x, y, z);
	}
	
	public static Vector3i add(Vector3i a, Vector3i b)
	{
		return new Vector3i(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
	}
	
	public static Vector3i add(Vector3i a, int b)
	{
		return new Vector3i(a.getX() + b, a.getY() + b, a.getZ() + b);
	}
	
	public static Vector3i sub(Vector3i a, Vector3i b)
	{
		return new Vector3i(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
	}
	
	public static Vector3i sub(Vector3i a, int b)
	{
		return new Vector3i(a.getX() - b, a.getY() - b, a.getY() - b);
	}
	
	public static Vector3i mul(Vector3i a, Vector3i b)
	{
		return new Vector3i(a.getX() * b.getX(), a.getY() * b.getY(), a.getZ() * b.getZ());
	}
	
	public static Vector3i mul(Vector3i a, int b)
	{
		return new Vector3i(a.getX() * b, a.getY() * b, a.getZ() * b);
	}
	
	public static Vector3i div(Vector3i a, Vector3i b)
	{
		return new Vector3i(a.getX() / b.getX(), a.getY() / b.getY(), a.getZ() / b.getZ());
	}
	
	public static Vector3i div(Vector3i a, int b)
	{
		return new Vector3i(a.getX() / b, a.getY() / b, a.getZ() / b);
	}
	
	@Deprecated
	public static void set(Vector3i a, Vector3i b)
	{
		a = b;
		
		return;
	}
	
	public static String toString(Vector3i r)
	{
		return "(" + r.getX() + " " + r.getY() + " " + r.getZ() + ")";
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
}
