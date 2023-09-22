/* 	
Q13.
1 1 1 1
1 1 1 1
1 1 1 1
1 1 1 1

*/
 
import java.util.*;
 
class Q13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++)
		{
			
			for(int j = 1; j <= n; j++)
				System.out.print(1 + " ");
			
			System.out.println();
		}
	}
}
 
			
 
 