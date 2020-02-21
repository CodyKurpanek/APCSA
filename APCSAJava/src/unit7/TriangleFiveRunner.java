package unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive a = new TriangleFive('c', 5);
	   System.out.println(a);
	   a.setLetter('A');
	   a.setAmount(5);
	   System.out.println(a);
	   a.setLetter('B');
	   a.setAmount(7);
	   System.out.println(a);
	   a.setLetter('X');
	   a.setAmount(6);
	   System.out.println(a);
	   a.setLetter('Z');
	   a.setAmount(8);
	   System.out.println(a);
   }
}
   /*============From Console==============
ccccc dddd eee ff g 
ccccc dddd eee ff 
ccccc dddd eee 
ccccc dddd 
ccccc 

AAAAA BBBB CCC DD E 
AAAAA BBBB CCC DD 
AAAAA BBBB CCC 
AAAAA BBBB 
AAAAA 

BBBBBBB CCCCCC DDDDD EEEE FFF GG H 
BBBBBBB CCCCCC DDDDD EEEE FFF GG 
BBBBBBB CCCCCC DDDDD EEEE FFF 
BBBBBBB CCCCCC DDDDD EEEE 
BBBBBBB CCCCCC DDDDD 
BBBBBBB CCCCCC 
BBBBBBB 

XXXXXX YYYYY ZZZZ AAA BB C 
XXXXXX YYYYY ZZZZ AAA BB 
XXXXXX YYYYY ZZZZ AAA 
XXXXXX YYYYY ZZZZ 
XXXXXX YYYYY 
XXXXXX 

ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF G 
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF 
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE 
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD 
ZZZZZZZZ AAAAAAA BBBBBB CCCCC 
ZZZZZZZZ AAAAAAA BBBBBB 
ZZZZZZZZ AAAAAAA 
ZZZZZZZZ 
}
*/