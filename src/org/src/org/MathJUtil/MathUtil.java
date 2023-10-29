/*
 * EPL-2.0 license
 * 
 * Rights CoolDuderCoder
 */

package org.MathJUtil;

public class MathUtil 
{
	public static boolean equal(int a, int b)
	{
		return a == b;
	}
	
	public static float sin(float value)
	{	
		return (float)Math.sin(value);
	}
	
	public static float cos(float value)
	{
		return (float)Math.cos(value);
	}
	
	public static float sin(float value, float amplitude)
	{
		return (float)(Math.sin(value) * Math.sin(amplitude));
	}
	
	public static float cos(float value, float amplitude)
	{
		return (float)(Math.cos(value) * Math.cos(amplitude));
	}
	
	public static float floor(float value)
	{
		return (float)Math.floor(value);
	}
	
	public static float ceil(float value)
	{
		return (float)Math.ceil(value);
	}
	
	public static float tan(float a)
	{
		return (float)Math.tan(a);
	}
	
	public static float pow(float a, float b)
	{
		return (float)Math.pow(a, b);
	}
	
	public static float toDegrees(float angdeg)
	{
		return (float)Math.toDegrees(angdeg);
	}
	
	public static float toRadians(float angdeg)
	{
		return (float)Math.toRadians(angdeg);
	}
	
	public static int round(float value)
	{
		return Math.round(value);
	}
	
	public static float clamp(float value, float min, float max)
	{
		if (value < min)
			value = min;
		
		if (value > max)
			value = max;
		
		return value;
	}
}
