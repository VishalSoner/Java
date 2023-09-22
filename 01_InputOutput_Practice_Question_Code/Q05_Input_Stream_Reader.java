import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Q05_Input_Stream_Reader
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Any Character");
		String str = br.readLine();
		
		System.out.println(str);
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




