import java.util.Scanner;

class Q09_Exception_Handling_Throw_Keyword
{
	public static void main(String args[])
	{
		System.out.print("Enter Age : ");
		Scanner sc = new Scanner(System.in);
		byte age = sc.nextByte();
		
		if( age < 18)
		{
			System.out.print("Invalid Age, you Can't Drive ");
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
Enter Age : 10

Output :
Invalid Age, you Can't Drive Vishal

----------------------------

input : 
Enter Age : 50

Output :
Welcome you Can Drive Vishal
---------------------------------------------------------------------------------------------
*/




