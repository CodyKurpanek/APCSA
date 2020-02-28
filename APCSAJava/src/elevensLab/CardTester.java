package elevensLab;

public class CardTester{
	public static void main(String args[]) {
		Card a = new Card("King", "Spades", 13);
		Card b = new Card("Queen", "Diamonds", 12);
		Card c = new Card("Jack", "Clubs", 11);
		
		
		System.out.println(a);
		a.setRank("Queen");
		a.setSuit("Diamonds");
		a.setPointValue(12);
		System.out.println("Changed to " + a + a.getRank() + a.getSuit() + a.getPointValue() );
		System.out.println(a + " == " + b + "? " + a.isSame(a, b) + "\n");
		
		System.out.println(b);
		b.setRank("eight");
		b.setSuit("Clubs");
		b.setPointValue(8);
		System.out.println("Changed to" + b + b.getRank() + b.getSuit() + b.getPointValue());
		System.out.println(a + " == " + b + "? " + a.isSame(a, b) + "\n");
		
		System.out.println(c);
		c.setRank("five");
		c.setSuit("Hearts");
		c.setPointValue(5);
		System.out.println("Changed to " + c + c.getRank() + c.getSuit() + c.getPointValue() + "\n");
	}
}
	