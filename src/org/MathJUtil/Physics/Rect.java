/**
 * @author CoolDuderCoder
 * 
 * EPL-2.0 license
 */

package org.MathJUtil.Physics;

import org.MathJUtil.Beta;

@Beta (betaClass=Rect.class)
public class Rect 
{
	public int x1, x2;
	public int y1, y2;
	public Rect(int x1, int y1, int x2, int y2)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public static boolean overlaps(Rect RectA, Rect RectB)
	{
		return (RectA.x1 < RectB.x2) && (RectA.x2 > RectB.x1) &&
			   (RectA.y1 < RectB.y2) && (RectA.y2 > RectB.y1);
	}
}
