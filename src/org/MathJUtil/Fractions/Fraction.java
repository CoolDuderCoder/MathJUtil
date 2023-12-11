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

package org.MathJUtil.Fractions;

/**
 * A class that represents a Fraction
 * @author CoolDuderCoder
 */
public class Fraction 
{
	public static final Fraction FULL = new Fraction(1, 1);
	public static final Fraction HALF = new Fraction(1, 2);
	public static final Fraction QUARTER = new Fraction(1, 3);
	
	private int enumerator;
	private int denominator;
	
	/**
	 * Initializing Fraction
	 * @param enumerator
	 * @param denominator
	 */
	public Fraction(int enumerator, int denominator)
	{
		this.enumerator = enumerator;
		this.denominator = denominator;
	}
	
	/**
	 * Returns the added value of a + r
	 * @param a
	 * @param r
	 * @return the added value of a + r
	 */
	public static Fraction add(Fraction a, int r)
	{
		return new Fraction(a.getEnumerator() + r, a.getDenominator() + r);
	}
	
	/**
	 * Returns the added value of a + b
	 * @param a
	 * @param b
	 * @return the added value of a + b
	 */
	public static Fraction add(Fraction a, Fraction b)
	{
		return new Fraction(a.getEnumerator() + b.getEnumerator(), a.getDenominator() + b.getDenominator());
	}
	
	/**
	 * Returns the subtracted value of a - r
	 * @param a
	 * @param r
	 * @return the subtracted value of a - r
	 */
	public static Fraction sub(Fraction a, int r)
	{
		return new Fraction(a.getEnumerator() - r, a.getDenominator() - r);
	}
	
	/**
	 * Returns the subtracted value of a - b
	 * @param a
	 * @param b
	 * @return the subtracted value of a - b
	 */
	public static Fraction sub(Fraction a, Fraction b)
	{
		return new Fraction(a.getEnumerator() - b.getEnumerator(), a.getDenominator() - b.getDenominator());
	}
	
	/**
	 * Returns the product of a and r
	 * @param a
	 * @param r
	 * @return the product of a and r
	 */
	public static Fraction mul(Fraction a, int r)
	{
		return new Fraction(a.getEnumerator() * r, a.getDenominator() * r);
	}
	
	/**
	 * Returns the product of a and b
	 * @param a
	 * @param b
	 * @return the product of a and b
	 */
	public static Fraction mul(Fraction a, Fraction b)
	{
		return new Fraction(a.getEnumerator() * b.getEnumerator(), a.getDenominator() * b.getDenominator());
	}
	
	/**
	 * Returns the quotient of a and r
	 * @param a
	 * @param r
	 * @return the quotient of a and r
	 */
	public static Fraction div(Fraction a, int r)
	{
		return new Fraction(a.getEnumerator() / r, a.getDenominator() / r);
	}
	
	/**
	 * Returns the quotient of a and b
	 * @param a
	 * @param r
	 * @return the quotient of a and b
	 */
	public static Fraction div(Fraction a, Fraction b)
	{
		return new Fraction(a.getEnumerator() / b.getEnumerator(), a.getDenominator() / b.getDenominator());
	}
	
	/**
	 * Returns the fraction in word form
	 * @param r
	 * @return the fraction in word form
	 */
	public static String toString(Fraction r)
	{
		return r.getEnumerator() + "/" + r.getDenominator();
	}
	
	/**
	 * Returns the enumerator of the fraction
	 * @return enumerator of the fraction
	 */
	public int getEnumerator()
	{
		return enumerator;
	}
	
	/**
	 * Sets the enumerator of the fraction
	 */
	public void setEnumerator(int enumerator)
	{
		this.enumerator = enumerator;
	}
	
	/**
	 * Returns the denominator of the fraction
	 * @return denominator of the fraction
	 */
	public int getDenominator()
	{
		return denominator;
	}
	
	/**
	 * Sets the denominator of the fraction
	 */
	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}
}
