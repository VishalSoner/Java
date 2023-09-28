import java.util.Scanner;

class Q03_Exception_Handlingclass_try_Catch
{
	public static void main(String args[])
	{
		int x = Integer.parseInt( args[0] );
		int y = Integer.parseInt( args[1] );
		
		catch( Exception we)
		{
			System.out.println( x/y );
		}
	}
}

/* 
Output :- 

: error: 'catch' without 'try'

--------------------------------------------------------------------------------------------- 
*/





{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter X : ");
		int x = sc.nextInt();
		System.out.print("Enter Y: ");
		int y = sc.nextInt();
		
		try
		{
			System.out.println("\nOutput : " + x/y );
		}
		catch( ArithmeticException e)
		{
			System.out.println( e );
		}
	}
}

/* 

Case - 1 
input : 
Enter X : 10
Enter Y: 20

Output : 0


..................


Case - 2
input : 
Enter X : 100
Enter Y: 20

Output : 5

.................


Case - 3
input :

Enter X : 0
Enter Y: 20

Output : 0


.................


Case - 4
input :
Enter X : 100
Enter Y: 0

Output :- 
java.lang.ArithmeticException: / by zero

--------------------------------------------------------------------------------------------- 
*/




