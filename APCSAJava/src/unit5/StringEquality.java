package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;
	public boolean compare = false;

	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
		if (one.equals(two)){
			compare = true;
		}
		else {
			compare = false;
		}
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
		if (one.equals(two)){
			compare = true;
		}
		else {
			compare = false;
		}
	}

	public boolean checkEquality( )
	{
		if (wordOne.compareTo(wordTwo) == 0) {
			return true;
		}
		return false;
	}

	public String toString()
	{
		if (compare == true) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}