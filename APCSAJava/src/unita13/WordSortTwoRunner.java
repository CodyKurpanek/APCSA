package unita13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner file = new Scanner(new File("APCSAJava/src/unita13/wordsort2.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i < size; i++)
		{
			String sentence = file.nextLine();
			//instantiate a new WordSort
			WordSortTwo wst = new WordSortTwo(sentence);
			wst.sort();
			System.out.println(wst);
		}
	}
}
/*===========================From Console=====================
[BIG, BROWN, FOX, IS, LAZY!, THE]
[AM, AM, BIG, I, I, IS, SAM, SAM, SAM]
[1234, 5678, ONE, TWO]
[1, 2, 3, a, b, i, j]
*/