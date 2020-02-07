package unit3;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0.0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	
	public void calcDistance()
	{
		distance = Math.sqrt(Math.pow((double)xTwo - xOne, 2) + Math.pow((double)yTwo - yOne, 2));
	}
	
	public double getDistance()
	{
		return Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
	}
	
	public void print()
	{
		System.out.printf("distance == %.3f\n", distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return String.format("xOne = %d, xTwo = %d", xOne, xTwo);
	}
	public static void main(String[] args) {
		char a = 97;
		char A = 65;
		System.out.println(a + "" + A);
	}
}