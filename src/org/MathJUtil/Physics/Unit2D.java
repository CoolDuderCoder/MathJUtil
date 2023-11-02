package org.MathJUtil.Physics;

import org.MathJUtil.Vectors.Vector2f;

public class Unit2D 
{
	private Vector2f units;
	
	public Unit2D(Vector2f units)
	{
		this.units = units;
	}
	
	public Unit2D(float x, float y)
	{
		this(new Vector2f(x, y));
	}
	
	public Vector2f getUnits()
	{
		return units;
	}
	
	public void setUnits(Vector2f units)
	{
		this.units = units;
	}
}
