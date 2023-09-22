import java.util.Scanner;
import java.io.IOException;

class Q19_Scanner_nextInt
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st : ");
		int a1 = sc.nextInt();
		
		System.out.print("Enter 2nd : ");
		int a2 = sc.nextInt();
		
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		
		System.out.println("Sun : " + (a1+a2) );
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





