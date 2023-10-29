/*
 * EPL-2.0 license
 * 
 * Rights CoolDuderCoder
 */

package org.MathJUtils.Arrays;

import java.nio.IntBuffer;

import org.MathJUtil.MathJUtilException;
import org.MathJUtil.MemoryUtils;

public class IntArray 
{	
	private IntBuffer arr;
	
	public IntArray(int cap)
	{
		this.arr = ArrayUtils.AllocateIntBuffer(cap);
	}
	
	public IntArray(int[] arr)
	{
		this.arr = ArrayUtils.IntArrayToIntBuffer(arr);
	}
	
	public int addValue(int value) throws MathJUtilException
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
	
	public int get(int index) throws MathJUtilException
	{
		if (index > arr.capacity())
			throw new MathJUtilException("Index Out Of Bounds!: arr.length: " + arr.position() + " index given: " + index);
		
		if (index < 0x0)
			throw new MathJUtilException("Index Out Of Bounds!: NULL ADDRESS GIVEN");
		
		return arr.get(index);
	}
	
	public int[] getArr()
	{
		return ArrayUtils.IntBufferToIntArray(arr);
	}
	
	public void setArr(int[] arr)
	{
		this.arr = ArrayUtils.IntArrayToIntBuffer(arr);
	}
}
