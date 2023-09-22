/* 	

Q29.
1*2*3*4
9*10*11*12
5*6*7*8
13*14*15*16


*/
 
import java.util.*;
 
class Q29
{
	public static void main(String args[])
	{
		int n = 4;
		int a = 1;
		int t = 2*n + 1;
	
		for(int i = 1 ; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if( i % 2 == 1)
					System.out.print(a++);
				else
					System.out.print(t++);

				if(j != n)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
