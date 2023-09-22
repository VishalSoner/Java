/* 	

Q19.
3 
4 4
5 5 5
6 6 6 6

*/
 
import java.util.*;
 
class Q19
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();
	
		int k = 3;
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(k + " ");
			}
			k++;
			System.out.println();
		}
	}
}
 
			
 
 