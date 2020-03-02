package elevensLab;
public class DeckTester{
	public static void main(String args0[]) {
		String[] ranks = {"A", "B", "C"}, suits = {"Giraffes", "Lions"};
		int[] values = {2,1,6};
		Deck one = new Deck(ranks, suits, values);
		System.out.println(one.deal());
		System.out.println("Size = " +one.size());
		System.out.println("isEmpty? " + one.isEmpty());
		
		
		
		
	}
}