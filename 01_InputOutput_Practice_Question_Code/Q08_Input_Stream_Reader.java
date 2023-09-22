import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Q08_Input_Stream_Reader
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter Name : ");
		char a = (char)br.read();
		char b = (char)br.read();
		char c = (char)br.read();
		char d = (char)br.read();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}

/*	

Input :- 
Enter Name : abcd

Output :-
a
b
c
d

Input :-
Enter Name : abc

Output
a
b
c
space


Input :- 
Enter Name : ab

Output :-
a
b
space
space


Input :-
Enter Name : a

Output
a
space
space
space




--------------------------------------------------------------------------------------------------------------------------	*/




