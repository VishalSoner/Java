class A
{
	int x = 100;
	void show2()
	{
		System.out.println("Show - 2");
	}
	
	static void show1()
	{
		A a = new A();
		a.show2();
		System.out.println("X : " + a.x);
	}
	
}

class Q07_Static_Class
{
	public static void main(String args[])
	{
		A a = new A();
		a.show1();
	}
}

/* 

Show - 2
X : 100
-----------------------------------------------------------------------------------------------
*/





