package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect tester = new Perfect(6);
		if (tester.isPerfect()) {
			System.out.println("Perfect");
		}
		else {
			System.out.println("not Perfect");
		}
	}
}