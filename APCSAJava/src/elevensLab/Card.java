package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		private String rank, suit;
		private int pointValue;
		private int face = -1;

  	//constructors
	public Card(String suit, int face) {
		this.suit = suit;
		this.face = face;
	}

	public Card(String rank, String suit, int pointValue){
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}


	// modifiers
	public void setRank(String rank){
		this.rank = rank;
	}
	public void setSuit(String suit){
		this.suit = suit;
	}
	public void setPointValue(int pointValue){
		this.pointValue = pointValue;
	}
	public void setFace(int face) {
		this.face = face;
	}
	


  	//accessors
	public String getRank(){
		return rank;
	}
	public String getSuit() {
		return suit;
	}
	public int getPointValue() {
		return pointValue;
	}
	public int getFace() {
		return face;
	}
	
	
	//methods
	public boolean isSame(Card a, Card b) {
		if (a.rank == b.rank) {
			if (a.suit == b.suit) {
				if (a.pointValue == b.pointValue) {
					return true;
				}
			return false;	
			}
		return false;	
		}
	return false;
	}

  	//toString
	public String toString(){
		if (rank != null) {
			return (rank + " of " + suit + " (point value = " + pointValue + ")");
		}
		if (face != -1) {
			return (FACES[face] + " of " + suit);
		}
		return "";
	}

 }