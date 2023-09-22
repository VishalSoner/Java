import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Q03_Input_Stream_Reader
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Any Character");
		char a = (char)br.read();
		
		System.out.println(a);
	}
}


/*	

Input  :- Vishal
Output :- V

Input  :- 1234
Output :- 1

--------------------------------------------------------------------------------------------------------------------------	*/




