package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck{
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	
	private List<Card> cards;
	private int top;
	//Deck Constructors
	public Deck(){
   	//refer cards to new ArrayList
		cards = new ArrayList<Card>();
   	//set top to the top of the deck 51
		top = 51;
   	//loop through all suits
		for (int i = 0; i < SUITS.length; i ++) {
			//loop through all faces 1 to 13
			for (int j = 1; j < 14; j ++) {
				cards.add(new Card(SUITS[i], j));
			}
		}
   			//add a new TwentyOneCard to the deck

	}
	public Deck(String[] ranks, String[] suits, int[] values){
		cards = new ArrayList<Card>();
		for (String rank: ranks) {
			for (String suit: suits) {
				for (int value: values) {
					cards.add(new Card(rank, suit, value));
				}
			}
		}
		top = cards.size() - 1;
	}
	
	
   //make a dealCard() method that returns the top card
   public Card dealCard() {
	   top -= 1;
	   return cards.get(top + 1);
   }
   
   
   public Card deal() {
	   top -= 1;
	   return cards.get(top + 1);
   }
   
   //write a shuffle() method
   public void shuffle() {
	   //use Colletions.shuffle
	   Collections.shuffle(cards);
	   //reset the top card 
	   top = 51;
   }
   
   public boolean isEmpty() {
	   if (cards.size() == 0) {
		   return true;
	   }
	   return false;
   }
   
   public int size(){
	   return (top + 1);
   }
 
}
