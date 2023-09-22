/* 	
Q21.

3
44
555
6666
555
44
3
*/
 
import java.util.*;
 
class Q21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();

		int k = 1;
		int value = 2;
		
		int mid  = (n%2 == 0) ? n/2 : n/2+1;
		
		for(int i = 1; i <= n; i++)
		{
			k = ( mid >= i) ?  ++k : --k ;
			value = ( mid >= i) ?  ++value : --value ;

			for(int j = 1; j < k; j++)
			{
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
 
			
 
 