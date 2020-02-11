package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality a = new StringEquality("hello", "goodbye");
		a.checkEquality();
		System.out.println(a);
		a.setWords("one", "two");
		a.checkEquality();
		System.out.println(a);
		a.setWords("three", "four");
		a.checkEquality();
		System.out.println(a);
		a.setWords("TCEA", "UIL");
		a.checkEquality();
		System.out.println(a);
		a.setWords("State", "Champions");
		a.checkEquality();
		System.out.println(a);
		a.setWords("ABC", "ABC");
		a.checkEquality();
		System.out.println(a);
		a.setWords("one", "two");
		a.checkEquality();
		System.out.println(a);
	}
}