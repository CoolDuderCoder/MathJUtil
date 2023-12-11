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

package org.MathJUtil;

/**
 * Options for MathJUtil
 * @author CoolDuderCoder
 */
public class Options 
{
	public static final boolean UNSAFE_VERSION = exists(System.getProperty("org.MathJUtil.UnsafeVersion", "False"));
	
	public static final boolean FORCE_UNSAFE = exists(System.getProperty("org.MathJUtil.ForceUnsafe", "False"));
	
	public static final boolean DEBUG = exists(System.getProperty("org.MathJUtil.Debug", "False"));
	
	/**
	 * Returns if it exists
	 * @param v
	 * @return if v exists
	 */
	private static boolean exists(String v)
	{
		if (v == null)
            return false;
        if (v.trim().length() == 0)
            return true;
        return Boolean.valueOf(v).booleanValue();
	}
}
