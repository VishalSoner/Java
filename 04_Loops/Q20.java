/* 	

Q20.
3 
4  5
6  7  8
9 10 11 12

*/
 
import java.util.*;
 
class Q20
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
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
}
 
			
 
 