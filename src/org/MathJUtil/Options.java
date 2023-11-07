/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil;

public class Options 
{
	public static final boolean UNSAFE_VERSION = exists(System.getProperty("org.MathJUtil.UnsafeVersion", "False"));
	
	public static final boolean FORCE_UNSAFE = exists(System.getProperty("org.MathJUtil.ForceUnsafe", "False"));
	
	public static final boolean DEBUG = exists(System.getProperty("org.MathJUtil.Debug", "False"));
	
	private static boolean exists(String v)
	{
		if (v == null)
            return false;
        if (v.trim().length() == 0)
            return true;
        return Boolean.valueOf(v).booleanValue();
	}
}
