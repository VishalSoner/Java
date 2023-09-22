/* 	

Q17.
10 9 8 7 
 4 5 6
 3 2
 1

*/
 
import java.util.*;
 
class Q17
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();
	
		int k = 10;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(k-- + " ");
			}
			
			System.out.println();
		}
	}
}
 
			
 
 