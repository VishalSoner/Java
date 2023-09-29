class A
{
	void show()
	{
		System.out.println("Default Parameter");
	}

	int show()
	{
		System.out.println("Default Parameter");
		return 10;
	}
}
class Q03_Polymorphism_Overloading
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 
Output :- 

error: method show() is already defined in class A
        int show()
--------------------------------------------------------------------------------------------- 
*/




