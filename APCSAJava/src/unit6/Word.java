package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;
import java.lang.Character;

public class Word
{
	private String word;
	private String backward;
	private char first;
	private char last;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		word = s;
		first = word.charAt(0);
		last = word.charAt(word.length() - 1);
	}

	public void setString(String s)
	{
		word = s;
		first = word.charAt(0);
		last = word.charAt(word.length() - 1);

	}

	public char getFirstChar()
	{
		first = word.charAt(0);
		return word.charAt(0);
	}

	public char getLastChar()
	{
		last = word.charAt(word.length() - 1);
		return word.charAt(word.length() - 1);
	}

	public String getBackWards()
	{
		String back=word.substring(word.length() - 1);
		for (int i = word.length() - 2; i >= 0; i --) {
			back = back + word.substring(i, i + 1);
		}
		backward = back;
		return back;
	}

 	public String toString()
 	{
 		return Character.toString(first) + "\n" + last + "\n" + backward + "\n" + word + "\n";
	}
}