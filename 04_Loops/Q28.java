/* 	

Q28.

13*14*15*16
9*10*11*12
5*6*7*8
1*2*3*4


*/
 
import java.util.*;
 
class Q28
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();

		int k = n*n;
	
		k = k - n + 1;
		for(int i = 1 ; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(k++);
				if(j != n)
					System.out.print("*");
					
			}
			k = k - 2 * n;
			System.out.println();
		}
		
	}
}