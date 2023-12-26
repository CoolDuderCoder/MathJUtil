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

/**
 * A Class for bounds constrained to a grid
 * @author CoolDuderCoder
 */
public class GridBounds 
{
	private int offset;
	
	private int width;
	private int height;
	
	private int x;
	private int y;
	
	/**
	 * Creates grid bounds
	 * @param offset
	 * @param width
	 * @param height
	 * @param x
	 * @param y
	 */
	public GridBounds(int offset, int width, int height, int x, int y)
	{
		this.offset = offset;
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Sets x
	 * @param x
	 */
	public void setX(int x)
	{
		this.x = x;
	}
	
	/**
	 * Sets y
	 * @param y
	 */
	public void setY(int y)
	{
		this.y = y;
	}
	
	/**
	 * @return calculated x
	 */
	public int getGridX()
	{
		return (x * width) + offset;
	}
	
	/**
	 * @return calculated y
	 */
	public int getGridY()
	{
		return (y * height) + offset;
	}
}
