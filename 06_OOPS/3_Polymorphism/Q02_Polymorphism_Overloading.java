class A
{
	void show()
	{
		System.out.println("Default Parameter");
	}

	void show()
	{
		System.out.println("Default Parameter");
	}
}
class Q02_Polymorphism_Overloading
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
	   void show()
--------------------------------------------------------------------------------------------- 
*/




