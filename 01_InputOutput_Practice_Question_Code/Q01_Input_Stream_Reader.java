import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Q01_Input_Stream_Reader
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Any Character");
		int a = br.read();
		
		System.out.println(a);
		
	}
}

// Input  : abcd
// Output : 97

// Input  : 123456
// Output : 49

//----------------------------------------------------------------------------------------------------------------------------




