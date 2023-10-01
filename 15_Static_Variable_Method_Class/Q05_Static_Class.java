class A
{
	int x = 100;
	void show2()
	{
		System.out.println("Show - 2");
	}
	
	static void show1()
	{
		show2();
		System.out.println("X : " + x);
	}
	
}

class Q05_Static_Class
{
	public static void main(String args[])
	{
		A a = new A();
		a.show1();
	}
}

/* 

error: non-static method show2() cannot be referenced from a static context
                show2();
                ^
Q05_Static_Class.java:12: error: non-static variable x cannot be referenced from a static context
                System.out.println("X : " + x);
                                            ^
-----------------------------------------------------------------------------------------------
*/





