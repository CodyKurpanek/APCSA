package celebrityLab;

public class ESportsCelebrity extends Celebrity{
	private String esport;
	
	
	public ESportsCelebrity(String answer, String esport, String clue) {
		super(answer, clue);
		this.esport = esport;
		// TODO Auto-generated constructor stub
	}
	
	public String getClue()
	{
		return "ESport Celeberity: " + this.getClue();
	}
	
	public String getClue2() {
		return getClue();
	}

	
	public String toString() {
		return ("The Celebrity is " + getAnswer());
	}
}