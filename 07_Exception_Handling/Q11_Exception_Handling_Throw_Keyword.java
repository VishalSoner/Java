import java.util.Scanner;

class Q11_Exception_Handling_Throw_Keyword
{
	public static void main(String args[])
	{
		System.out.print("Enter Age : ");
		Scanner sc = new Scanner(System.in);
		byte age = sc.nextByte();
		
		if( age < 18)
		{
			ArithmeticException are = new ArithmeticException("Invalid Age");
			throw are;
		}
		else
		{
			System.out.print("Welcome you Can Drive ");
		}
		System.out.println("Vishal");
	}
}

/*
input : 
Enter Age : 50

Output :
Welcome you Can Drive Vishal

----------------------------

input : 
Enter Age : 10

Output :
Exception in thread "main" java.lang.ArithmeticException: Invalid Age
---------------------------------------------------------------------------------------------
*/




