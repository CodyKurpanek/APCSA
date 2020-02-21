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
		compChoice = this.chose();
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
		if (a == 3) {
			return "S";
		}
		return "Failed";
	}

	public void setPlayers(String player) {
		playChoice = player;
		compChoice = this.chose();
	}

	public String determineWinner() {
		String winner = "Computer";
		if (!(playChoice.contentEquals("R") || playChoice.contentEquals("P") || playChoice.contentEquals("S")))
		{
			return "invalid input";
		}
		if (playChoice.equals("R"))
		{
			if (compChoice.equals("S")) {
				winner = "Player";
			}
		}
		if (playChoice.equals("P")) {
			if (compChoice.equals("R")) {
				winner = "Player";
			}
		}
		if (playChoice.equals("S")) {
			if (compChoice.equals("R")) {
				winner = "Player";
			}
		}
		return winner;
	}

	public String toString() {
		String output = "";
		return output;
	}
}