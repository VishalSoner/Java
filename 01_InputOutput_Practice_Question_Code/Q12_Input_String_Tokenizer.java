import java.util.StringTokenizer;
import java.io.IOException;

class Q12_Input_String_Tokenizer
{
	public static void main(String args[]) throws Exception
	{
		String s1 = "My Name";
		
		StringTokenizer st = new StringTokenizer(s1);
		
		String a1 = st.nextToken();
		String a2 = st.nextToken();
		String a3 = st.nextToken();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}

/*	

Input :- 
My Name is Vishal Soner

Output :- 
Exception in thread "main" java.util.NoSuchElementException


--------------------------------------------------------------------------------------------------------------------------	*/

