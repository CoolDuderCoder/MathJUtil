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

import org.MathJUtil.Vectors.Vector3f;

/**
 * A 3D Unit class
 * @author CoolDuderCoder
 */
public class Unit3D 
{
	private Vector3f units;
	
	/**
	 * Initializing Unit3D
	 * @param units
	 */
	public Unit3D(Vector3f units)
	{
		this.units = units;
	}
	
	/**
	 * Initializing Unit3D
	 * @param x
	 * @param y
	 * @param z
	 */
	public Unit3D(float x, float y, float z)
	{
		this(new Vector3f(x, y, z));
	}
	
	/**
	 * @return units
	 */
	public Vector3f getUnits()
	{
		return units;
	}
	
	/**
	 * Sets units
	 * @param units
	 */
	public void setUnits(Vector3f units)
	{
		this.units = units;
	}
}