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
 * Class for MathJUtil exceptions
 * @author CoolDuderCoder
 */
public class MathJUtilException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Creates a blank exception
	 */
	public MathJUtilException()
	{
		super();
	}
	
	/**
	 * Creates an exception with a message
	 * @param message
	 */
	public MathJUtilException(String message)
	{
		super(message);
	}
	
	/**
	 * Creates an exception with a message and a cause of that exception
	 * @param message
	 * @param cause
	 */
	public MathJUtilException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	/**
	 * Creates an exception with a cause of the exception
	 * @param cause
	 */
	public MathJUtilException(Throwable cause)
	{
		super(cause);
	}
}
