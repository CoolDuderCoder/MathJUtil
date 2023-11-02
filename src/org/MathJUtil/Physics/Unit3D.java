package org.MathJUtil.Physics;

import org.MathJUtil.Vectors.Vector3f;

public class Unit3D 
{
	private Vector3f units;
	
	public Unit3D(Vector3f units)
	{
		this.units = units;
	}
	
	public Unit3D(float x, float y, float z)
	{
		this(new Vector3f(x, y, z));
	}
	
	public Vector3f getUnits()
	{
		return units;
	}
	
	public void setUnits(Vector3f units)
	{
		this.units = units;
	}
}