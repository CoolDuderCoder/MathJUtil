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

package org.MathJUtil.Arrays;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/**
 * Utilities for java's built in arrays
 * @author CoolDuderCoder
 */
public class ArrayUtils
{
	/**
	 * Allocates an IntBuffer with whatever cap set
	 * @param cap
	 * @return allocated IntBuffer
	 */
	public static IntBuffer AllocateIntBuffer(int cap)
	{
		return IntBuffer.allocate(cap);
	}
	
	/**
	 * IntBuffer to Int Array
	 * @param buffer
	 * @return Int Array
	 */
	public static int[] IntBufferToIntArray(IntBuffer buffer)
	{
		return buffer.array();
	}
	
	/**
	 * Int Array to IntBuffer
	 * @param arr
	 * @return IntBuffer
	 */
	public static IntBuffer IntArrayToIntBuffer(int[] arr)
	{
		IntBuffer buffer = IntBuffer.allocate(arr.length);
		
		for (int i = 0; i < arr.length; i++)
			buffer.put(arr[i]);
		
		return buffer;
	}
	
	/**
	 * Allocates an FloatBuffer with whatever cap set
	 * @param cap
	 * @return Allocated FloatBuffer
	 */
	public static FloatBuffer AllocateFloatBuffer(int cap)
	{
		return FloatBuffer.allocate(cap);
	}
	
	/**
	 * FloatBuffer to Float Array
	 * @param buffer
	 * @return Float Array
	 */
	public static float[] FloatBufferToFloatArray(FloatBuffer buffer)
	{
		return buffer.array();
	}
	
	/**
	 * Float Array to FloatBuffer
	 * @param arr
	 * @return FloatBuffer
	 */
	public static FloatBuffer FloatArrayToFloatBuffer(float[] arr)
	{
		FloatBuffer buffer = FloatBuffer.allocate(arr.length);
		
		for (int i = 0; i < arr.length; i++)
			buffer.put(arr[i]);
		
		return buffer;
	}
}
