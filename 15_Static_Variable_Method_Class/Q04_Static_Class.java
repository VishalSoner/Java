class A
{
	int x = 100;
	void show2()
	{
		System.out.println("Show - 2");
	}
	
	void show1()
	{
		show2();
		System.out.println("X : " + x);
	}
	
}

class Q04_Static_Class
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





