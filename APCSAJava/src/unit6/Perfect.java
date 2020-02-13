package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   	public Perfect(int num){
   		number = num;
   	}
   	
   	public Perfect() {
   		
   	}
	//add a set method
   	public void setNumber(int num){
   		number = num;
   	}

	public boolean isPerfect()
	{
		int result = 0;
		int[] nums = new int[number - 1];
		for(int i = 1; i < number; i++) {
			nums[i - 1] = i;
		}
		
		for(int value: nums) {
			if (number % value == 0) {
				result += value;
			}
		}
		if (result == number) {
			return true;
		}
		System.out.println(result);
		return false;
	}

	//add a toString	
	
}