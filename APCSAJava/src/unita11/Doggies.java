package unita11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	
	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
		if (spot < pups.length) {
			pups[spot] = new Dog(age, name);
		}
		else {
			System.out.println("Set failed");
		}
	}

	public String getNameOfOldest()
	{
		int tmp = -1;
		String oldest = "";
		for (Dog dog: pups) {
			if (dog.getAge() > tmp) {
				tmp = dog.getAge();
				oldest = dog.getName();
			}
		}
		return oldest;
	}

	public String getNameOfYoungest()
	{
		int tmp = 10000;
		String youngest = "";
		for (Dog dog: pups) {
			if (dog.getAge() < tmp) {
				tmp = dog.getAge();
				youngest = dog.getName();
			}
		}
		return youngest;
	}

	public String toString()
	{
		return "" + Arrays.toString(pups);
	}
}