package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private int yesPerfect;
   public int inputNum;

	//add constructors
   	public Perfect(int num){
   		number = num;
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
			yesPerfect = 1;
		}
		else {
			yesPerfect = 0;
		}
   	}
   	
   	public Perfect() {
   		
   	}
	//add a set method
   	public void setNumber(int num){
   		number = num;
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
			yesPerfect = 1;
		}
		else {
			yesPerfect = 0;
		}
   	}

	public boolean isPerfect()
	{
		int result = 0;
		inputNum = number;
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

	public String toString(){
		if (yesPerfect == 1) {
			return number + " is perfect";
		}
		if (yesPerfect == 0) {
			return number + " is not perfect";
		}
		else {
			return "Please run the isPerfect method";
		}
	}
	
}