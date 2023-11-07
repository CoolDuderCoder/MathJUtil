/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil.Angles;

import org.MathJUtil.Vectors.Vector2f;

public class Angle2D 
{
	private Vector2f angle;
	
	public Angle2D()
	{
		angle = new Vector2f();
	}
	
	public Angle2D(Vector2f angle)
	{
		this.angle = angle;
	}
	
	public Angle2D(Angle r)
	{
		this.angle = new Vector2f(r.getAngle());
	}
	
	public Angle2D(Angle x, Angle y)
	{
		this.angle = new Vector2f(x.getAngle(), y.getAngle());
	}
	
	public Vector2f getAngle()
	{
		return angle;
	}
	
	public void setAngle(Vector2f angle)
	{
		this.angle = angle;
	}
}
