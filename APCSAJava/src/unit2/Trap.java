package unit2;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Trap
{
	public static String removeA(String sentence)
	{
		while (sentence.indexOf("a") >= 0){
			int index = sentence.indexOf("a");
			String newString = sentence.substring(0,index) + sentence.substring(index + 1);
			sentence = newString;
		}
		return sentence;
	}
	public static String reverse(String input)
	{
		String reversed = "";
		for (int i = 0; i < input.length(); i ++) {
			String tmp = input.substring(i, i + 1);
			reversed = tmp + reversed;
		}
		return reversed;
	}
		
	public static double area( int base1, int base2, int height )
	{
		return 0;
	}
}