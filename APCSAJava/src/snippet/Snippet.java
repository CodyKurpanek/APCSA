package snippet;

public class Snippet {
	public boolean nearHundred(int n) {
	  if (Math.abs(100 - n) <= 10)
	  {
	    return true;
	  }
	  else if (Math.abs(200 - n) <= 10)
	  {
	    return true;
	  }
	  else
	  {
	    return false;
	  }
	}
	
}

