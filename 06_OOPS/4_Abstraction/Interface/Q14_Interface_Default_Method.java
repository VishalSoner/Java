/*
	Q1. Kya ham Default Method ko OverRide kar karte he
	Ans Yes, we can OverRide Interface Default Method.
*/

interface Inter1
{
	default void show()
	{
		System.out.println("Default Method Interface Inter1");
	}	
}
class A implements Inter1
{
	public void show()
	{
		System.out.println("Default Method Class A");
	}
}

class Q14_Interface_Default_Method
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

Default Method Class Ad

--------------------------------------------------------------------------------------------- 
*/




