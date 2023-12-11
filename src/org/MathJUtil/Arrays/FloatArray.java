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

import org.MathJUtil.MathJUtilException;
import org.MathJUtil.MemoryUtils;

/**
 * A class based around the FloatBuffer
 * @author CoolDuderCoder
 */
public class FloatArray 
{	
	private FloatBuffer arr;
	
	/**
	 * Initializing Float Array with an cap
	 * @param cap
	 */
	public FloatArray(int cap)
	{
		this.arr = ArrayUtils.AllocateFloatBuffer(cap);
	}
	
	/**
	 * Initializing Float Array with an array and the cap set to the array size
	 * @param arr
	 */
	public FloatArray(float[] arr)
	{
		this.arr = ArrayUtils.FloatArrayToFloatBuffer(arr);
	}
	
	/**
	 * Adds a value into the array
	 * @param value
	 * @return arrays position
	 * @throws MathJUtilException
	 */
	public int addValue(float value) throws MathJUtilException
	{
		if (arr.position() + 1 > arr.capacity())
			throw new MathJUtilException("Index Out Of Bounds!: arr.length: " + arr.position() + " index given: " + (arr.position() + 1));
		
		arr.put(value);
		
		return arr.position();
	}
	
	/**
	 * Sets a value null at passed in index
	 * @param index
	 * @throws MathJUtilException
	 */
	public void setNull(int index) throws MathJUtilException
	{
		if (index > arr.capacity())
			throw new MathJUtilException("Index Out Of Bounds!: arr.length: " + arr.position() + " index given: " + index);
		
		arr.put(index, MemoryUtils.NULL);
	}
	
	/**
	 * Returns the value at the index passed in
	 * @param index
	 * @return the value at the index passed in
	 * @throws MathJUtilException
	 */
	public float get(int index) throws MathJUtilException
	{
		if (index > arr.capacity())
			throw new MathJUtilException("Index Out Of Bounds!: arr.length: " + arr.position() + " index given: " + index);
		
		return arr.get(index);
	}
	
	/**
	 * Gets the Float Array
	 * @return Float Array
	 */
	public float[] getArr()
	{
		return ArrayUtils.FloatBufferToFloatArray(arr);
	}
	
	/**
	 * Sets the Float Array with the passed in value
	 * @param arr
	 */
	public void setArr(float[] arr)
	{
		this.arr = ArrayUtils.FloatArrayToFloatBuffer(arr);
	}
}
