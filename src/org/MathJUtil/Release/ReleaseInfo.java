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

package org.MathJUtil.Release;

import java.lang.reflect.Method;

import org.MathJUtil.Beta;
import org.MathJUtil.MathUtil;

/**
 * A class that stores the release info
 * @author CoolDuderCoder
 */
public class ReleaseInfo 
{
	public static final int VERSION_ID = 0x0;
	public static final int RELEASE_ID = 0x1;
	public static final int LISCENSE_ID = 0x2;
	
	private static final String VERSION_STRING = "1.0.1";
	private static final String RELEASE_STRING = "version " + VERSION_STRING;
	private static final String LISCENSE_STRING = "MIT License\r\n"
													+ "\r\n"
													+ "Copyright (c) 2023 CoolDuderCoder\r\n"
													+ "\r\n"
													+ "Permission is hereby granted, free of charge, to any person obtaining a copy\r\n"
													+ "of this software and associated documentation files (the \"Software\"), to deal\r\n"
													+ "in the Software without restriction, including without limitation the rights\r\n"
													+ "to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\r\n"
													+ "copies of the Software, and to permit persons to whom the Software is\r\n"
													+ "furnished to do so, subject to the following conditions:\r\n"
													+ "\r\n"
													+ "The above copyright notice and this permission notice shall be included in all\r\n"
													+ "copies or substantial portions of the Software.\r\n"
													+ "\r\n"
													+ "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\r\n"
													+ "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\r\n"
													+ "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\r\n"
													+ "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\r\n"
													+ "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\r\n"
													+ "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE\r\n"
													+ "SOFTWARE.";
	private static final String INVALID_STRING = "INVALID ID, NO CONTENT PROVIDED!";
	
	/**
	 * Gets the content of the id passed in
	 * @param type
	 * @return content of the id passed in
	 */
	public static String getInfo(int type)
	{
		if (MathUtil.equal(type, VERSION_ID))
			return VERSION_STRING;
		if (MathUtil.equal(type, RELEASE_ID))
			return RELEASE_STRING;
		if (MathUtil.equal(type, LISCENSE_ID))
			return LISCENSE_STRING;
		
		return INVALID_STRING;
	}
	
	/**
	 * Checks if a method is beta
	 * @param method
	 * @return if a method is beta
	 */
	public static boolean isMethodBeta(Method method)
	{
		return method.isAnnotationPresent(Beta.class);
	}
}
