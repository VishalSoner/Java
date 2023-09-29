class A
{
	int x = 30;
}

class B extends A
{
	int x = 20;
	
	void show()
	{
		int x = 10;
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		
	}
}

class Q09_This_Keyword
{
	public static void main(String args[])
	{
		B b = new B();
		b.show();
	}	
}

/* 
10
20
30

------------------------------------------------------------------------------------------------
*/








