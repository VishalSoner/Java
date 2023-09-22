import java.util.Scanner;
import java.io.IOException;

class Q17_Scanner_Next
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		String s4 = sc.next();
		
		System.out.println("Output : " + s1);
		System.out.println("Output : " + s2);
		System.out.println("Output : " + s3);
		System.out.println("Output : " + s4);
	}
}

/*	
Input :- 
Enter Name : 10 20 30 40 50

Output : 10
Output : 20
Output : 30
Output : 40


Input :- 
Enter Name : 10 
20 
30
40

Output : 10
Output : 20
Output : 30
Output : 40




Input :- 
Enter Name : Enter
10 
20 
30
40

Output : 10
Output : 20
Output : 30
Output : 40


--------------------------------------------------------------------------------------------------------------------------	*/





