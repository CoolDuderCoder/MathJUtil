/*****************************************************************************
 * MIT License
 * Copyright (c) 2023 CoolDuderCoder
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *****************************************************************************/

package org.MathJUtil.Physics;

import org.MathJUtil.Beta;
import org.MathJUtil.Vectors.Vector2f;
import org.MathJUtil.Vectors.Vector3f;

/**
 * A class that handles acceleration
 * @author CoolDuderCoder
 */
@Beta (betaClass=Acceleration.class)
public class Acceleration 
{
	/**
	 * Calculates the equation
	 * _   _
	 * a = v/t /\t
	 * 
	 * @param timeSec
	 * @param timeTakingSec
	 * @param vel
	 * @return returns the calculations of the equation above
	 */
	public static Unit2D calculateAccel2D(float timeSec, float timeTakingSec, Unit2D vel)
	{
		Unit2D unit = new Unit2D(Vector2f.mul(Vector2f.div(vel.getUnits(), timeTakingSec), timeSec));
		
		return unit;
	}
	
	/**
	 * Calculates the equation
	 * _   _
	 * a = v/t /\t
	 * 
	 * @param timeSec
	 * @param timeTakingSec
	 * @param vel
	 * @return returns the calculations of the equation above
	 */
	public static Unit3D calculateAccel3D(float timeSec, float timeTakingSec, Unit3D vel)
	{
		Unit3D unit = new Unit3D(Vector3f.mul(Vector3f.div(vel.getUnits(), timeTakingSec), timeSec));
		
		return unit;
	}
}
