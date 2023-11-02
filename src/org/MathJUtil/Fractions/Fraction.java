/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil.Fractions;

public class Fraction 
{
	public static final Fraction FULL = new Fraction(1, 1);
	public static final Fraction HALF = new Fraction(1, 2);
	public static final Fraction QUARTER = new Fraction(1, 3);
	
	private int enumerator;
	private int denominator;
	
	public Fraction(int enumerator, int denominator)
	{
		this.enumerator = enumerator;
		this.denominator = denominator;
	}
	
	public static Fraction add(Fraction a, int r)
	{
		return new Fraction(a.getEnumerator() + r, a.getDenominator() + r);
	}
	
	public static Fraction add(Fraction a, Fraction b)
	{
		return new Fraction(a.getEnumerator() + b.getEnumerator(), a.getDenominator() + b.getDenominator());
	}
	
	public static Fraction sub(Fraction a, int r)
	{
		return new Fraction(a.getEnumerator() - r, a.getDenominator() - r);
	}
	
	public static Fraction sub(Fraction a, Fraction b)
	{
		return new Fraction(a.getEnumerator() - b.getEnumerator(), a.getDenominator() - b.getDenominator());
	}
	
	public static Fraction mul(Fraction a, int r)
	{
		return new Fraction(a.getEnumerator() * r, a.getDenominator() * r);
	}
	
	public static Fraction mul(Fraction a, Fraction b)
	{
		return new Fraction(a.getEnumerator() * b.getEnumerator(), a.getDenominator() * b.getDenominator());
	}
	
	public static Fraction div(Fraction a, int r)
	{
		return new Fraction(a.getEnumerator() / r, a.getDenominator() / r);
	}
	
	public static Fraction div(Fraction a, Fraction b)
	{
		return new Fraction(a.getEnumerator() / b.getEnumerator(), a.getDenominator() / b.getDenominator());
	}
	
	public static String toString(Fraction r)
	{
		return r.getEnumerator() + "/" + r.getDenominator();
	}
	
	public int getEnumerator()
	{
		return enumerator;
	}
	
	public void setEnumerator(int enumerator)
	{
		this.enumerator = enumerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}
}
