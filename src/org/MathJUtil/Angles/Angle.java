/*
 * EPL-2.0 license
 * 
 * Rights CoolDuderCoder
 */

package org.MathJUtil.Angles;

import org.MathJUtil.MathUtil;

public class Angle
{
	public static final float RIGHT_ANGLE = MathUtil.toDegrees(90);
	public static final float STRAIGHT_ANGLE = MathUtil.toDegrees(180);
	public static final float FULL_ROTATION = MathUtil.toDegrees(360);
	
	private float angle;
	
	public Angle(float angle)
	{
		this.angle = MathUtil.toDegrees(angle);
	}
	
	public static String toString(Angle a)
	{
		return a.getAngle() + "°";
	}
	
	public float getAngle()
	{
		return angle;
	}
	
	public void setAngle(float angle)
	{
		this.angle = angle;
	}
}
