import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Q02_Input_Stream_Reader
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Any Character");
		char a = br.read();
		
		System.out.println(a);
	}
}


/*	Output :-  

error: incompatible types: possible lossy conversion from int to char
char a = br.read();
--------------------------------------------------------------------------------------------------------------------------	*/


