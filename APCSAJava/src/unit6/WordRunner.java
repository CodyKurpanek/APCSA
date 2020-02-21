package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;
import java.lang.Character;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word a = new Word("Hello");
		String backwards = a.getBackWards();
		System.out.println(a);
		a.setString("World");
		backwards = a.getBackWards();
		System.out.println(a);
		a.setString("JukeBox");
		backwards = a.getBackWards();
		System.out.println(a);
		a.setString("TCEA");
		backwards = a.getBackWards();
		System.out.println(a);
		a.setString("UIL");
		backwards = a.getBackWards();
		System.out.println(a);
		
	}
	/*===============From Console==============
	 * H
o
olleH
Hello

W
d
dlroW
World

J
x
xoBekuJ
JukeBox

T
A
AECT
TCEA

U
L
LIU
UIL
	 */
}
