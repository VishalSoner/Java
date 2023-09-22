import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Q04_Input_Stream_Reader
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Any Character");
		char a = (char)br.read();
		char b = (char)br.read();
		char c = (char)br.read();
		char d = (char)br.read();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}


/*	

Input  :- Vishal
Output :- V
		  i
		  s
		  h
		  

Input  :- 1234
Output :- 1
		  2
		  3
		  4
--------------------------------------------------------------------------------------------------------------------------	*/




