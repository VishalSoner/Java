/* 	

Q27.
1*2*3*4
5*6*7*8
9*10*11*12
13*14*15*16

*/
 
import java.util.*;
 
class Q27
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
				System.out.print(k++);
				if( j != n)
				System.out.print("*");
					
			}
			System.out.println();
		}
		
	}
}