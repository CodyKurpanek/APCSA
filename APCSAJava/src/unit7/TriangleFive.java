package unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.ArrayList;

public class TriangleFive
{
   private char letter;
   private int amount;
   private String result;

	public TriangleFive()
	{

	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt;
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		result = "";
		
		String result1 = "";
		char letter1 = letter;
		for (int i = amount; i > 0; i--) {
			int j = i;
			while(j > 0) {
				result = result + letter1;
				j --;
			}
			result += " ";
			if (letter1 != 90) {
				letter1 ++;
			}
			else {
				letter1 = 'A';
			}
		}
		
		result1 = result;
		int val = 2;
		int change = 3;
		for (int i = amount; i > 0; i --) {
			result = result + "\n" + result1.substring(0, result1.length() - val); 
			val += change;
			change += 1;
		}
		
		String output=result;
		return output;
	}
}