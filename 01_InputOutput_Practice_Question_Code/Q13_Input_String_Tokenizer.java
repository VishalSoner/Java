import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

class Q13_Input_String_Tokenizer
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter String : ");
		String s1 = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s1);
		
		String a1 = st.nextToken();
		String a2 = st.nextToken();
		String a3 = st.nextToken();
		String a4 = st.nextToken();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
}

/*	

Input :- 
My Name is Vishal Soner

Output :- 
Exception in thread "main" java.util.NoSuchElementException


--------------------------------------------------------------------------------------------------------------------------	*/

