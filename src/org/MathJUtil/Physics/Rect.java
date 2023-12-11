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

/**
 * A rect class
 * @author CoolDuderCoder
 */
@Beta (betaClass=Rect.class)
public class Rect 
{
	public int x1, x2;
	public int y1, y2;
	
	/**
	 * Initializing Rect
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public Rect(int x1, int y1, int x2, int y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	/**
	 * Checks if a rect overlaps another rect
	 * @param RectA
	 * @param RectB
	 * @return if a rect overlaps another rect
	 */
	public static boolean overlaps(Rect RectA, Rect RectB)
	{
		return (RectA.x1 < RectB.x2) && (RectA.x2 > RectB.x1) &&
			   (RectA.y1 < RectB.y2) && (RectA.y2 > RectB.y1);
	}
}
