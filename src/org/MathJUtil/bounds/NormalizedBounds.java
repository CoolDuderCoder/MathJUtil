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

package org.MathJUtil.bounds;

import org.MathJUtil.MathUtil;

/**
 * @author CoolDuderCoder
 */
public class NormalizedBounds 
{
	private float width;
	private float height;
	
	private float x;
	private float y;
	
	/**
	 * Creates normalized bounds
	 * @param width
	 * @param height
	 * @param x
	 * @param y
	 */
	public NormalizedBounds(float width, float height, float x, float y)
	{
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @return normalized x
	 */
	public int getNormalizedX()
	{
		return MathUtil.round(x * width);
	}
	
	/**
	 * @return normalized y
	 */
	public int getNormalizedY()
	{
		return MathUtil.round(y * height);
	}
}
