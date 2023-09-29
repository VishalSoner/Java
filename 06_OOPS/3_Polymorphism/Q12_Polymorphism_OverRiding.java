class A
{}

class B extends A
{}

class Q12_Polymorphism__OverRiding
{
	public static void main(String args[])
	{
		B b = new B();
		
		b.show(10, 20);
	}
}

/* 
Output :- 

error: cannot find symbol
       b.show(10, 20);
	    ^
--------------------------------------------------------------------------------------------- 
*/




