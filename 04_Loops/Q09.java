/* 	

Q9.

* * * * * * *
  *       *
    *   * 
      * 
  
  
*/
 
import java.util.*;
 
class Q09
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int k = 1; k <= i ; k++)
				System.out.print(" ");
			
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || j == 1 || i+j == n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
 
			
 