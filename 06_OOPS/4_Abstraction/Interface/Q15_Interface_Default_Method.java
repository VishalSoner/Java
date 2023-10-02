/*
	Q2. Why we add default method in interface.
	Ans Yadi ham chate he implement class me interface me method add karne se koi effect na ho 
		esha liye default method ka use kar sakte he.
*/

interface Inter1
{
	default void show()
	{
		System.out.println("Default Method Interface Inter1");
	}	
}

interface Inter2
{
	default void show()
	{
		System.out.println("Default Method Interface Inter2");
	}	
}

class A implements Inter1, Inter2
{
}

class Q15_Interface_Default_Method
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

error: class A inherits unrelated defaults for show() from types Inter1 and Inter2
class A implements Inter1, Inter2
^

--------------------------------------------------------------------------------------------- 
*/




