/* 	

Q31.
1
2*2
3*3*3
4*4*4*4
3*3*3
2*2
1


*/
 
import java.util.*;
 
class Q31
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();

		// if( n % 2 == 0)
			// n--;
		
		int mid = n/2 + 1;
		
		int a = 0;

		for(int i = 1 ; i <= n; i++)
		{
			a = ( mid >= i) ? ++a : --a ;
			
			for(int j = 1; j <= a; j++)
			{
				System.out.print(a);

				if(j != i && 1 != i)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
