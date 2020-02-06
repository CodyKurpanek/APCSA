package unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter X1");
		int x1 = input.nextInt();
		System.out.println("Enter Y2");
		int y1 = input.nextInt();
		System.out.println("Enter X2");
		int x2 = input.nextInt();
		System.out.println("Enter Y2");
		int y2 = input.nextInt();
		Distance d = new Distance(x1, y1, x2, y2);
		d.calcDistance();
		d.print();
	}
}