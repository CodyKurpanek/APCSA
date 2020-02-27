package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import unit8.RayDown;
import java.util.Arrays;

public class DownRunner
{
	public static void main( String args[] )
	{				
		Integer[] a = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		System.out.println(ListDown.go(Arrays.asList(a)));
		Integer[] b = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(ListDown.go(Arrays.asList(b)));		
		Integer[] c = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(ListDown.go(Arrays.asList(c)));
		Integer[] d = {32767};
		System.out.println(ListDown.go(Arrays.asList(d)));
		Integer[] e = {255,255};
		System.out.println(ListDown.go(Arrays.asList(e)));
		Integer[] f = {9,10,-88,100,-555,1000};
		System.out.println(ListDown.go(Arrays.asList(f)));
		Integer[] g = {10,10,10,11,456};
		System.out.println(ListDown.go(Arrays.asList(g)));
		Integer[] h = {-111,1,2,3,9,11,20,30};
		System.out.println(ListDown.go(Arrays.asList(h)));
		Integer[] i = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(ListDown.go(Arrays.asList(i)));
		Integer[] j = {12,15,18,21,23,1000};
		System.out.println(ListDown.go(Arrays.asList(j)));
		Integer[] k = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(ListDown.go(Arrays.asList(k)));
		Integer[] l = {9,10,-8,10000,-5000,1000};
		System.out.println(ListDown.go(Arrays.asList(l)));
	}
	/*========================From Console=================
	 * false
true
false
false
false
false
false
false
true
false
true
false
	 */
}