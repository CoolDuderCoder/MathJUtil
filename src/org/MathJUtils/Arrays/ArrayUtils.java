/*
 * EPL-2.0 license
 * 
 * Rights CoolDuderCoder
 */

package org.MathJUtils.Arrays;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class ArrayUtils
{
	public static IntBuffer AllocateIntBuffer(int cap)
	{
		return IntBuffer.allocate(cap);
	}
	
	public static int[] IntBufferToIntArray(IntBuffer buffer)
	{
		return buffer.array();
	}
	
	public static IntBuffer IntArrayToIntBuffer(int[] arr)
	{
		IntBuffer buffer = IntBuffer.allocate(arr.length);
		
		for (int i = 0; i < arr.length; i++)
			buffer.put(arr[i]);
		
		return buffer;
	}
	
	public static FloatBuffer AllocateFloatBuffer(int cap)
	{
		return FloatBuffer.allocate(cap);
	}
	
	public static float[] FloatBufferToFloatArray(FloatBuffer buffer)
	{
		return buffer.array();
	}
	
	public static FloatBuffer FloatArrayToFloatBuffer(float[] arr)
	{
		FloatBuffer buffer = FloatBuffer.allocate(arr.length);
		
		for (int i = 0; i < arr.length; i++)
			buffer.put(arr[i]);
		
		return buffer;
	}
}
