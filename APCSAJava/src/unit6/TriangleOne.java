package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		word = s;
		System.out.println(s);
		for (int i = s.length() - 1; i > 0; i --) {
			System.out.println(s.substring(0, i));
		}
	}

	public void setWord(String s)
	{
		word = s;
		System.out.println(s);
		for (int i = s.length() - 1; i > 0; i --) {
			System.out.println(s.substring(0, i));
		}
	}

	public void print( )
	{
	}
}