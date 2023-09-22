/* 	

Q6.

          *
		* * *
	  * * * * *
	* * * * * * *
  * * * * * * * * *
  
  
*/
 
import java.util.*;
 
class Q06
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int k = 1; k <= n-i ; k++)
				System.out.print(" ");
			
			for(int j = 1; j < 2 * i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
 
			
 