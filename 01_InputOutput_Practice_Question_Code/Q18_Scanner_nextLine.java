import java.util.Scanner;
import java.io.IOException;

class Q18_Scanner_nextLine
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println("Output : " + s1);
		System.out.println("Output : " + s2);
	}
}

/*	
Input :- 
Enter Name : 10 20 30 40

Output :-
Output : 10 20 30 40
------


Input :- 
Enter Name : 10 20 30 40
Enter

Output :-
Output : 10 20 30 40
Output : blank

--------------------------------------------------------------------------------------------------------------------------	*/





