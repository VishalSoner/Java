/* 	

Q26.
* * * * * * * * * * *
*       * * *       *
*     *   *   *     *
*   *     *     *   *
* *       *       * *
* * * * * * * * * * *
* *       *       * *
*   *     *     *   *
*     *   *   *     *
*       * * *       *
* * * * * * * * * * *

*/
 
import java.util.*;
 
class Q26
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();

		int k = 1;
	
		for(int i = 1 ; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i==1||j==1||i==n||j==n||i==n/2+1||j==n/2+1|| (j-i == n/2)||(i-j==n/2)||(i+j==n/2+2)||(i+j==n/2+n+1))
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
			System.out.println();
		}
		
	}
}