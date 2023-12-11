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
 * This class is a math util with the basic functions
 * @author CoolDuderCoder
 */
public class MathUtil 
{
	public static final float PI = (float)Math.PI;
	public static final float PI2 = PI * 2.0f;
	public static final float PIHALF = PI * 0.5f;
	public static final float ONE_OVER_PI = 1.0f / PI;
	
	/**
	 * Checks if two numbers equal each other
	 * @param a
	 * @param b
	 * @return two numbers equal each other
	 */
	public static boolean equal(int a, int b)
	{
		return a == b;
	}
	
	/**
	 * Calculates a random number between 0 and 1
	 * @return random number between 0 and 1
	 */
	public static float random()
	{
		return (float)Math.random();
	}
	
	/**
	 * Calculates a sine between -1, 1
	 * @param value
	 * @return a sine between -1, 1
	 */
	public static float sin(float value)
	{	
		return (float)Math.sin(value);
	}
	
	/**
	 * Calculates a cosine between -1, 1
	 * @param value
	 * @return a cosine between -1, 1
	 */
	public static float cos(float value)
	{
		return (float)Math.cos(value);
	}
	
	/**
	 * Calculates a sine between -amplitude, amplitude
	 * @param value
	 * @param amplitude
	 * @return a sine between -amplitude, amplitude
	 */
	public static float sin(float value, float amplitude)
	{
		return (float)(Math.sin(value) * Math.sin(amplitude));
	}
	
	/**
	 * Calculates a cosine between -amplitude, amplitude
	 * @param value
	 * @param amplitude
	 * @return a cosine between -amplitude, amplitude
	 */
	public static float cos(float value, float amplitude)
	{
		return (float)(Math.cos(value) * Math.cos(amplitude));
	}
	
	/**
	 * Calculates the floor of a value
	 * @param value
	 * @return the floor of a value
	 */
	public static float floor(float value)
	{
		return (float)Math.floor(value);
	}
	
	/**
	 * Calculates the ceil of a value
	 * @param value
	 * @return the ceil of a value
	 */
	public static float ceil(float value)
	{
		return (float)Math.ceil(value);
	}
	
	/**
	 * Calculates the tangent of a value
	 * @param a
	 * @return the tangent of a value
	 */
	public static float tan(float a)
	{
		return (float)Math.tan(a);
	}
	
	/**
	 * Calculates the tanh of a value
	 * @param a
	 * @return the tanh of a value
	 */
	public static float tanh(float a)
	{
		return (float)Math.tanh(a);
	}
	
	/**
	 * Calculates the atan of a value
	 * @param a
	 * @return the atan of a value
	 */
	public static float atan(float a)
	{
		return (float)Math.atan(a);
	}
	
	/**
	 * Calculates the atan2 of a value
	 * @param a
	 * @param b
	 * @return the atan2 of a value
	 */
	public static float atan2(float a, float b)
	{
		return (float)Math.atan2(a, b);
	}
	
	/**
	 * Calculates the pow of the two values
	 * @param a
	 * @param b
	 * @return the pow of the two values
	 */
	public static float pow(float a, float b)
	{
		return (float)Math.pow(a, b);
	}
	
	/**
	 * Calculates the degrees of a value
	 * @param angdeg
	 * @return the degrees of a value
	 */
	public static float toDegrees(float angdeg)
	{
		return (float)Math.toDegrees(angdeg);
	}
	
	/**
	 * Returns the radians of a value
	 * @param angdeg
	 * @return the radians of a value
	 */
	public static float toRadians(float angdeg)
	{
		return (float)Math.toRadians(angdeg);
	}
	
	/**
	 * Returns the value rounded
	 * @param value
	 * @return the value rounded
	 */
	public static int round(float value)
	{
		return Math.round(value);
	}
	
	/**
	 * Returns the clamped value between min and max
	 * @param value
	 * @param min
	 * @param max
	 * @return the clamped value between min and max
	 */
	public static float clamp(float value, float min, float max)
	{
		if (value < min)
			value = min;
		
		if (value > max)
			value = max;
		
		return value;
	}
}
