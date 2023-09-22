import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Q16_Input_String_Tokenizer_countToken
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter Number : ");
		String s1 = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s1);
		int sum = 0;
		
		System.out.println( "Total Tokens : " + st.countTokens() );
				
		while( st.countTokens() != 0)
		{
			String temp = st.nextToken();
			System.out.println(temp);
			
			sum += Integer.parseInt(temp);
		}

		System.out.println( "Total Tokens : " + st.countTokens() );
		System.out.println("\nSum : " + sum);
	}
}

/*	

Input :- 
Enter Number : 10 20 30 40

Output :- 
Total Tokens : 4
10
20
30
40
Total Tokens : 0

Sum : 100
--------------------------------------------------------------------------------------------------------------------------	*/





