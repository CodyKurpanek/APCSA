package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
<<<<<<< HEAD
		if(numArray.size() < 3) {
			return false;
		}
		for(int i = 1; i < numArray.size(); i ++) {
			if (numArray.get(i - 1) < numArray.get(i)) {
				return false;
			}
		}
=======
>>>>>>> branch 'master' of https://github.com/CodyKurpanek/APCSA.git
		return true;
	}	
}