package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		String tmp = "";
		String a = "";
		for (int i = 0; i < str.length() - 1; i++) {
			a = tmp;
			tmp = str.substring(i, i + 1);
			if (a.equals(tmp)) {
				count += 1;
			}
		}	
		if (str.length() != 1) {
			if (str.substring(str.length() - 1).equals( str.substring(str.length() - 2, str.length() - 1))){
				count += 1;
			}
		}
		return count;
	}
}