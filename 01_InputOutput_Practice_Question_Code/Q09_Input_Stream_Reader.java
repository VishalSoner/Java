import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Q09_Input_Stream_Reader
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Name : ");
		int a = br.read();
		int b = br.read();
		int c = br.read();
		int d = br.read();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
}

/*
Input :- 
Enter Name : 1234

Output :- 
49
50
51
52


Input :- 
Enter Name : 123

Output :- 
49
50
51
13


Input :- 
Enter Name : 12

Output :- 
49
50
13
10


Input :- 
Enter Name : 1

Output :- 
49
13
10
13


Input :- 
Enter Name : 

Output :- 
13
10
13
10


--------------------------------------------------------------------------------------------------------------------------	*/




