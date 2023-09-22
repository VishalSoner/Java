/* 	

Q8.
* * * * * * * * *
  * * * * * * *
    * * * * * 
      * * * 
	    * 
  
  
*/
 
import java.util.*;
 
class Q08
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int k = 1; k <= i ; k++)
				System.out.print("  ");
			
			for(int j = 1; j <= 2*n - (2*i - 1); j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
 
			
 