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
		for (int i = 0; i < 3; i++) {
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
	/*===============Output copied from Console=================
Enter X1
1
Enter Y2
1
Enter X2
2
Enter Y2
1
distance == 1.000
Enter X1
1
Enter Y2
1
Enter X2
-2
Enter Y2
2
distance == 3.162
Enter X1
1
Enter Y2
1
Enter X2
0
Enter Y2
0
distance == 1.414
	 */
}