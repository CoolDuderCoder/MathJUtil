/*
 * EPL-2.0 license
 * 
 * Rights CoolDuderCoder
 */


package org.MathJUtil.Physics;

public class Circle 
{
	public float radius;
	
	public int x;
	public int y;
	
	public Circle(float radius, int x, int y)
	{
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	
	public static boolean overlaps(Circle a, Circle b)
	{
		int xDif = a.x - b.x;
		int yDif = a.y - b.y;
		
		float distanceSquared = xDif * xDif + yDif * yDif;
		
		return distanceSquared < (a.radius + b.radius) * (a.radius + b.radius);
	}
}
