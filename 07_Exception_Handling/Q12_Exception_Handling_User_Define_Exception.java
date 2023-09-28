import java.util.Scanner;

class Invalid_Age extends RuntimeException
{
	Invalid_Age()
	{}

	Invalid_Age(String s1)
	{
		super(s1);
	}
}

class Q12_Exception_Handling_User_Define_Exception
{
	public static void main(String args[])
	{
		System.out.print("Enter Age : ");
		Scanner sc = new Scanner(System.in);
		byte age = sc.nextByte();

		if( age < 18)
		{
			Invalid_Age ige = new Invalid_Age();
			throw ige;
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
Exception in thread "main" Invalid_Age
---------------------------------------------------------------------------------------------
*/




