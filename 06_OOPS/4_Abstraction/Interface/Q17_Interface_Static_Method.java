/*
	Q3. Kya Static Method ko v Interface ke andar bana sakte he.
	Ans Yes.
*/

interface Inter1
{
	static void show()
	{
		System.out.println("Static Method Interface Inter1");
	}	
}

class A implements Inter1
{
}

class Q17_Interface_Default_Method
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
	}
}

/* 

error: cannot find symbol
                a.show();
                 ^
--------------------------------------------------------------------------------------------- 
*/




