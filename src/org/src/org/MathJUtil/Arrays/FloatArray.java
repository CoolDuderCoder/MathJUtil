/*
 * EPL-2.0 license
 * 
 * Rights CoolDuderCoder
 */

package org.MathJUtil.Arrays;

import java.nio.FloatBuffer;

import org.MathJUtil.MathJUtilException;
import org.MathJUtil.MemoryUtils;

public class FloatArray 
{	
	private FloatBuffer arr;
	
	public FloatArray(int cap)
	{
		this.arr = ArrayUtils.AllocateFloatBuffer(cap);
	}
	
	public FloatArray(float[] arr)
	{
		this.arr = ArrayUtils.FloatArrayToFloatBuffer(arr);
	}
	
	public int addValue(float value) throws MathJUtilException
	{
		if (arr.position() + 1 > arr.capacity())
			throw new MathJUtilException("Index Out Of Bounds!: arr.length: " + arr.position() + " index given: " + (arr.position() + 1));
		
		arr.put(value);
		
		return arr.position();
	}
	
	public void setNull(int index) throws MathJUtilException
	{
		if (index > arr.capacity())
			throw new MathJUtilException("Index Out Of Bounds!: arr.length: " + arr.position() + " index given: " + index);
		
		arr.put(index, MemoryUtils.NULL);
	}
	
	public float get(int index) throws MathJUtilException
	{
		if (index > arr.capacity())
			throw new MathJUtilException("Index Out Of Bounds!: arr.length: " + arr.position() + " index given: " + index);
		
		return arr.get(index);
	}
	
	public float[] getArr()
	{
		return ArrayUtils.FloatBufferToFloatArray(arr);
	}
	
	public void setArr(float[] arr)
	{
		this.arr = ArrayUtils.FloatArrayToFloatBuffer(arr);
	}
}
