class A
{
	int x = 100;
	static void show()
	{
		System.out.println("X : " + x);
	}
}

class Q02_Static_Class
{
	public static void main(String args[])
	{
		A a = new A();
		a.show();
		
	}
}

/* 

 error: non-static variable x cannot be referenced from a static context
                System.out.println("X : " + x);
                                            ^
-----------------------------------------------------------------------------------------------
*/





