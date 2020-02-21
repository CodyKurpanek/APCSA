package unit7;
//(c) A+ Computer Science

// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors {
	private String playChoice;
	private String compChoice;

	public RockPaperScissors() {
	}

	public RockPaperScissors(String player)
	{
		playChoice = player;
		compChoice = 
	}

	public String chose()
	{
		int a = (int)Math.random() * 3 + 1;
		if (a == 1) {
			return "R";
		}
		if (a == 2) {
			return "P";
		}
		if ()
	}

	public void setPlayers(String player) {
	}

	public String determineWinner() {
		String winner = "";
		return winner;
	}

	public String toString() {
		String output = "";
		return output;
	}
}