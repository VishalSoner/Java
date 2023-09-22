import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Q14_Input_String_Tokenizer
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter Number : ");
		String s1 = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s1);
		
		int a1 = Integer.parseInt( st.nextToken() );
		int a2 = Integer.parseInt( st.nextToken() );
		int a3 = Integer.parseInt( st.nextToken() );
		int a4 = Integer.parseInt( st.nextToken() );
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println("Sum : " + (a1+a2+a3+a4) );
	}
}

/*	

Input :- Case - 1
Enter Number : 10 20 30 40

Output ;- 
10
20
30
40
100
------------

Input :- Case - 2
Enter Number : 10 20 30 40 50

Output ;- 
10
20
30
40
100
------------


Input :- Case - 3
Enter Number : 10 20 30

Output ;- 
Exception in thread "main" java.util.NoSuchElementException
------------



Input :- Case - 4
Enter Number : 10,20

Output ;- 
Exception in thread "main" java.util.NoSuchElementException


--------------------------------------------------------------------------------------------------------------------------	*/

