class A
{
	int x, y;
	void set(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	void sum()
	{
		System.out.println("Sum : " + (x+y) );
	}
}

class B extends A 
{
	void sub()
	{
		System.out.println("Sub : " + (x-y) );
	}
}

class C extends B
{
	void div()
	{
		System.out.println("div : " + (x/y) );
	}
}

class Q02_Multiple_Inheritance
{
	public static void main(String args[])
	{
		C c = new C();
		c.set(100, 20);
		c.sum();
		c.sub();
		c.div();
	}	
}





------------------------------------------------------------------------------------------------







