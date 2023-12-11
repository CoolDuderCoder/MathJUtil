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

package org.MathJUtil.Angles;

import org.MathJUtil.Vectors.Vector3f;

/**
 * Represents a 3D Angle
 * @author CoolDuderCoder
 */
public class Angle3D 
{
	private Vector3f angle;
	
	/**
	 * Initiliazing Angle3D
	 */
	public Angle3D()
	{
		this.angle = new Vector3f();
	}
	
	/**
	 * Initiliazing Angle3D with an 3D angle
	 * @param angle
	 */
	public Angle3D(Vector3f angle)
	{
		this.angle = angle;
	}
	
	/**
	 * Initiliazing Angle3D with an 1D angle
	 * @param angle
	 */
	public Angle3D(Angle r)
	{
		this.angle = new Vector3f(r.getAngle());
	}
	
	/**
	 * Initiliazing Angle3D with three 1D angles
	 * @param angle
	 */
	public Angle3D(Angle x, Angle y, Angle z)
	{
		this.angle = new Vector3f(x.getAngle(), y.getAngle(), z.getAngle());
	}
	
	/**
	 * Gets angle
	 * @return angle
	 */
	public Vector3f getAngle()
	{
		return angle;
	}
	
	/**
	 * Sets angle
	 * @param angle
	 */
	public void setAngle(Vector3f angle)
	{
		this.angle = angle;
	}
}