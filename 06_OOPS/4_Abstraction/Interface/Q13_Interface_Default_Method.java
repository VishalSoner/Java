/*
	Version 1.8 ke Corresponding interface ke ander default method wali bana sakte he.
*/

interface Inter1
{
	default void show()
	{
		System.out.println("Default Method");
	}
}
class A implements Inter1
{
}

class Q13_Interface_Default_Method
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

Default Method

--------------------------------------------------------------------------------------------- 
*/




