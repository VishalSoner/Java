/* 	
Q12. 
      * 
    * * * 
  * * * * *
* * * * * * *
  * * * * *
    * * *
      * 
*/
 
import java.util.*;
 
class Q12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total Rows : ");
		int n = sc.nextInt();
		
		int mid  = (n%2 == 0) ? n/2 : n/2+1;
		int k = 0;
			
		for(int i = 1; i <= n; i++)
		{
			
			k = ( mid >= i) ?  ++k : --k ;
				
			for(int j = 1; j <= mid-k; j++)
				System.out.print("  ");
			
			for(int j = 1; j <= 2*k-1; j++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
}
 
			
 
 