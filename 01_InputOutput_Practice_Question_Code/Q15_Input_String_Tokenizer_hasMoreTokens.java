import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Q15_Input_String_Tokenizer_hasMoreTokens
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter Number : ");
		String s1 = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s1);
		int sum = 0;
		
		System.out.println(st.hasMoreTokens() );
		
		while( st.hasMoreTokens() )
		{
			String temp = st.nextToken();
			System.out.println(temp);
			
			sum += Integer.parseInt(temp);
		}
		
		System.out.println(st.hasMoreTokens() );
		System.out.println("\nSum : " + sum);
		
	}
}

/*	

Input :- 10 20 30 40

Output
true
10
20
30
40
false

Sum : 100

--------------------------------------------------------------------------------------------------------------------------	*/





