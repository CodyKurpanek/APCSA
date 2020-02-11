package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner(System.in);
		//add in input
		for (int i = 0; i < 5; i ++) {
			System.out.println("Enter a whole number ::");
			int num = input.nextInt();
			System.out.println(String.format("%d is odd :: %b", num, NumberVerify.isOdd(num)));
			System.out.println(String.format("%d is even :: %b", num, NumberVerify.isEven(num)));
		}

		/* =============================From Console===============================
Enter a whole number ::
111
111 is odd :: true
111 is even :: false
Enter a whole number ::
2000
2000 is odd :: false
2000 is even :: true
Enter a whole number ::
-99
-99 is odd :: true
-99 is even :: false
Enter a whole number ::
1111
1111 is odd :: true
1111 is even :: false
Enter a whole number ::
-850
-850 is odd :: false
-850 is even :: true
		 */
		
	}
}