package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		TriangleOne a = new TriangleOne("Hippo");
		a.setWord("abcd");
		a.setWord("it");
		a.setWord("a");
		a.setWord("Chicken");
		
		/*===================From Console====================
Hippo
Hipp
Hip
Hi
H
abcd
abc
ab
a
it
i
a
Chicken
Chicke
Chick
Chic
Chi
Ch
C

		 */
	}
}