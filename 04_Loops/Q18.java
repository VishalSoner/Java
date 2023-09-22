/* 	

Q18.
6 6 6 6
5 5 5
4 4
3 

*/
 
import java.util.*;
 
class Q18
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();
	
		int k = 6;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(k + " ");
			}
			k--;
			System.out.println();
		}
	}
}
 
			
 
 