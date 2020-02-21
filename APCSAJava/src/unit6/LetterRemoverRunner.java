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
		t.setRemover("qwertyqwertyqwerty", 'a');
		System.out.print(t);
		System.out.println(t.removeLetters());
		t.setRemover("abababab", 'a');
		System.out.print(t);
		System.out.println(t.removeLetters());
		t.setRemover("abaababababa", 'x');
		System.out.print(t);
		System.out.println(t.removeLetters());

	/*===============From Console:========================
	 * ssssssssssssssssxsssssssssssssessssssss - letter to remove s
xe
I am Sam I am - letter to remove a
I m Sm I m
qwertyqwertyqwerty - letter to remove a
qwertyqwertyqwerty
abababab - letter to remove a
bbbb
abaababababa - letter to remove x
abaababababa		
	 */
	}
}