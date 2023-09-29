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

class C extends A
{
	void div()
	{
		System.out.println("div : " + (x/y) );
	}
}

class Q03_Hierarchical_Inheritance
{
	public static void main(String args[])
	{
		B b = new B();
		b.set(100, 10);
		b.sum();
		b.sub();
		
		System.out.println();
		C c = new C();
		c.set(200, 20);
		c.sum();
		c.div();
	}	
}




/* 
Sum : 110
Sub : 90

Sum : 220
div : 10 */
// ------------------------------------------------------------------------------------------------








