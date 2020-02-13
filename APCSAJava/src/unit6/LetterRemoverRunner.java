package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover t = new LetterRemover("ssssssssssssssssxsssssssssssssessssssss", 's');
		System.out.print(t);
		System.out.println(t.removeLetters());
		t.setRemover("I am Sam I am", 'a');
		System.out.print(t);
		System.out.println(t.removeLetters());
		
											
	}
}