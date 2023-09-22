import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Q06_Input_Stream_Reader
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Any Two Number : ");
		System.out.print("1st : ");
		String s1 = br.readLine();
		
		System.out.print("2st : ");
		String s2 = br.readLine();
		
		System.out.println("Concat Two String = " + (s1+s2) );
		
		int	x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);

		System.out.println("Sum = " + (x+y) );
	}
}

/*	

Input :- 
Enter Any Two Number :
1st : 10
2st : 20

Output :- 
Concat Two String = 1020
Sum = 30

--------------------------------------------------------------------------------------------------------------------------	*/




