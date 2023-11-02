/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil.Fractions;

import org.MathJUtil.MathUtil;

public class FractionMathUtil 
{
	@Deprecated
	public static float fractionToDecimal(Fraction a)
	{
		return a.getEnumerator() / a.getDenominator();
	}
	
	public static int fractionToPercentage(Fraction a)
	{
		return MathUtil.round(a.getEnumerator() * 100 / a.getDenominator());
	}
}