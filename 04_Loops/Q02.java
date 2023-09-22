/* 	Q2. 
* * * * *
*       *
*       *
*       *
* * * * *
*/
 
import java.util.*;
 
class Q02
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || j == 1 || i == n || j == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
 
 