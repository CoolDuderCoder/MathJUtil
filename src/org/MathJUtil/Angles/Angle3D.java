/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil.Angles;

import org.MathJUtil.Vectors.Vector3f;

public class Angle3D 
{
	private Vector3f angle;
	
	public Angle3D()
	{
		this.angle = new Vector3f();
	}
	
	public Angle3D(Vector3f angle)
	{
		this.angle = angle;
	}
	
	public Angle3D(Angle r)
	{
		this.angle = new Vector3f(r.getAngle());
	}
	
	public Angle3D(Angle x, Angle y, Angle z)
	{
		this.angle = new Vector3f(x.getAngle(), y.getAngle(), z.getAngle());
	}
	
	public Vector3f getAngle()
	{
		return angle;
	}
	
	public void setAngle(Vector3f angle)
	{
		this.angle = angle;
	}
}