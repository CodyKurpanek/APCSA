package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect tester = new Perfect(496);
		if (tester.isPerfect()) {
			System.out.println(tester.inputNum + " is Perfect");
		}
		else {
			System.out.println(tester.inputNum + " is not Perfect");
		}
		tester.setNumber(45);
		System.out.println(tester);
		tester.setNumber(6);
		System.out.println(tester);
		tester.setNumber(14);
		System.out.println(tester);
		tester.setNumber(8128);
		System.out.println(tester);
		tester.setNumber(1245);
		System.out.println(tester);
		tester.setNumber(33);
		System.out.println(tester);
		tester.setNumber(28);
		System.out.println(tester);
		tester.setNumber(27);
		System.out.println(tester);
		tester.setNumber(33550336);
		System.out.println(tester);
	}
	/*==================From Console==============================
	 * 496 is Perfect
45 is not perfect
6 is perfect
14 is not perfect
8128 is perfect
1245 is not perfect
33 is not perfect
28 is perfect
27 is not perfect
33550336 is perfect

	 */
}
