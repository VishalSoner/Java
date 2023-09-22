/* 	

Q30.
1
2*3
4*5*6
7*8*9*10

*/
 
import java.util.*;
 
class Q30
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();

		int a = 1;
	
		for(int i = 1 ; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(a++);

				if(j != i && 1 != i)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
