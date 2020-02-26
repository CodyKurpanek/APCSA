package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		int[] array = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		System.out.println(RayOddToEven.go(array));
		int[] b = {11,9,8,7,6,5,4,3,2,1,-99,7};
		System.out.println(RayOddToEven.go(b));
		int[] c = {10,20,30,40,5,41,31,20,11,7};
		System.out.println(RayOddToEven.go(c));
		int[] d = {32767,70,4,5,6,7};
		System.out.println(RayOddToEven.go(d));
		int[] e = {2,7,11,21,5,7};
		System.out.println(RayOddToEven.go(e));
		int[] f = {7,255,11,255,100,3,2};
		System.out.println(RayOddToEven.go(f));
		int[] g = {9,11,11,11,7,1000,3};
		System.out.println(RayOddToEven.go(g));
		int[] h = {7,7,7,11,2,7,7,11,11,2};
		System.out.println(RayOddToEven.go(h));
		int[] i = {2, 4, 6, 8, 8};
		System.out.println(RayOddToEven.go(i));
	}
	/*====================From Console===============
	 * 6
2
3
1
-1
4
5
4
-1
	 */
}