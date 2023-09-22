/* 	
Q15.
3 3 3
3 1 3
3 2 3
3 3 3
*/
 
import java.util.*;
 
class Q15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();

		for(int i = 1; i <= n+1; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if( i == 1 || j == 1 || i == n+1 || j == n)
					System.out.print(n + " ");
				else
					System.out.print(i-1 + " ");
			}
			
			System.out.println();
		}
	}
}
 
			
 
 