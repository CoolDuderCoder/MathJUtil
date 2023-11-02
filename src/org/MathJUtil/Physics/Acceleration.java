package org.MathJUtil.Physics;

import org.MathJUtil.Beta;
import org.MathJUtil.Vectors.Vector2f;
import org.MathJUtil.Vectors.Vector3f;

@Beta (betaClass=Acceleration.class)
public class Acceleration 
{
	/*
	 * _   _
	 * a = v/t /\t
	 */
	public static Unit2D calculateAccel2D(float timeSec, float timeTakingSec, Unit2D vel)
	{
		Unit2D unit = new Unit2D(Vector2f.mul(Vector2f.div(vel.getUnits(), timeTakingSec), timeSec));
		
		return unit;
	}
	
	public static Unit3D calculateAccel3D(float timeSec, float timeTakingSec, Unit3D vel)
	{
		Unit3D unit = new Unit3D(Vector3f.mul(Vector3f.div(vel.getUnits(), timeTakingSec), timeSec));
		
		return unit;
	}
}
