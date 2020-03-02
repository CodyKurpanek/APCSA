package unita11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int den;
	//write two constructors
	public Rational() {
		
	}
	
	public Rational(int numOne, int numTwo) {
		num = numOne;
		den = numTwo;
	}
	//write a setRational method
	public void setRational() {\
		int divideBY = -1;
		int max = Math.max(num, den);
		for(int i = 0; i < max; i ++) {
			if (i / num
		}
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int numerator) {
		num = numerator;
	}
	
	public void setDenominator(int denominator) {
		den = denominator;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		


		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for (int x = min; x > 1; x --) {
			if (numOne % x == 0 && numTwo % x == 0) {
				return x;
			}
		}
		return 1;
	}

	public Object clone ()
	{
		
		return new Rational(this.getNumerator(), this.getDenominator());
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator(){
		return num;
	}
	
	public int getDenominator() {
		return den;
	}
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}