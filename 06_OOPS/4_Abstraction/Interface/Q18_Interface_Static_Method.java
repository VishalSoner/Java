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

class Q18_Interface_Default_Method
{
	public static void main(String args[])
	{
		Inter1.show();
	}
}

/* 

Static Method Interface Inter1

--------------------------------------------------------------------------------------------- 
*/




