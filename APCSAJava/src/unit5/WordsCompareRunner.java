package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare a = new WordsCompare("abe", "ape");
	   a.compare();
	   System.out.println(a);
	   a.setWords("giraffe", "gorilla");
	   a.compare();
	   System.out.println(a);
	   a.setWords("one", "two");
	   a.compare();
	   System.out.println(a);
	   a.setWords("fun", "funny");
	   a.compare();
	   System.out.println(a);
	   a.setWords("123", "19");
	   a.compare();
	   System.out.println(a);
	   a.setWords("193", "1910");
	   a.compare();
	   System.out.println(a);
	   a.setWords("goofy", "godfather");
	   a.compare();
	   System.out.println(a);
	   a.setWords("giraffe", "gorilla");
	   a.compare();
	   System.out.println(a);
	   a.setWords("funnel", "fun");
	   a.compare();
	   System.out.println(a);
	}
   /*================From Console===================
abe should be placed before ape

giraffe should be placed before gorilla

one should be placed before two

fun should be placed before funny

123 should be placed before 19

193 should be placed after 1910

goofy should be placed after godfather

giraffe should be placed before gorilla

funnel should be placed after fun

    */
}