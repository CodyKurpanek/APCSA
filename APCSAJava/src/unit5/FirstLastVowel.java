package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public String go( String a ){
	   String[] vowels = {"a", "e", "i", "o","u"};
	   String isVowel = "no";
	   for (String vow : vowels) {
		   if (vow.equalsIgnoreCase(a.substring(0, 1)) || vow.equalsIgnoreCase(a.substring(a.length() - 1)) ) {
			   isVowel = "yes";
		   }
	   }
	   return isVowel;
   }
}